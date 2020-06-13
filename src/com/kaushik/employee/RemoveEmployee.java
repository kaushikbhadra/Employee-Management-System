package com.kaushik.employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RemoveEmployee implements ActionListener {
	
	JFrame rframe1;
	JLabel lb1,lb2,lb3,lb4,rlb1,rlb2,rlb3;
	JTextField tf1;
	JButton bt1,bt2,bt3,bt4;
	
	 RemoveEmployee() {
		    rframe1 = new JFrame("Remove Employee Detail");
			rframe1.setBackground(Color.white);
			rframe1.setLayout(null);
			
			ImageIcon imgIcon1 = new ImageIcon(ClassLoader.getSystemResource("com/kaushik/employee/Images/loginImg.jpg"));
		    Image img = imgIcon1.getImage().getScaledInstance(610,540,Image.SCALE_DEFAULT);
		    ImageIcon imgIcon2 = new ImageIcon(img);
		    JLabel lb = new JLabel(imgIcon2);
		    lb.setBounds(0,1,610,540);
		    
		    lb1 = new JLabel("Employee ID: ");
		    lb1.setBounds(40,50,150,30);
		    lb1.setFont(new Font("serif",Font.BOLD,20));
		    lb.add(lb1);
		    
		    tf1 = new JTextField(40);
			tf1.setBounds(200,50,170,30);
			lb.add(tf1);
		    
			    bt1 = new JButton("Search");
				bt1.setBounds(40,100,120,30);
				bt1.setFont(new Font("serif",Font.BOLD,15));
				bt1.addActionListener(this);
				bt1.setBackground(Color.BLUE);
				bt1.setForeground(Color.white);
				lb.add(bt1);
				
				bt2 = new JButton("Cancel");
				bt2.setBounds(180,100,120,30);
				bt2.setFont(new Font("serif",Font.BOLD,15));
				bt2.setBackground(Color.red);
				bt2.setForeground(Color.white);
				bt2.addActionListener(this);
				lb.add(bt2);
				
				lb2 = new JLabel("Name: ");
			    lb2.setBounds(40,110,150,30);
			    lb2.setFont(new Font("serif",Font.BOLD,20));
			    lb.add(lb2);
			    
			    rlb1 = new JLabel();
			    rlb1.setBounds(200,110,170,30);
			    rlb1.setForeground(Color.GRAY);
			    rlb1.setFont(new Font("serif",Font.BOLD,20));
				lb.add(rlb1);
				
				lb3 = new JLabel("Mobile Number: ");
			    lb3.setBounds(40,150,150,30);
			    lb3.setFont(new Font("serif",Font.BOLD,20));
			    lb.add(lb3);
			    
			    rlb2 = new JLabel();
			    rlb2.setBounds(200,150,170,30);
			    rlb2.setForeground(Color.GRAY);
			    rlb2.setFont(new Font("serif",Font.BOLD,20));
				lb.add(rlb2);
				
				lb4 = new JLabel("Email-Id: ");
			    lb4.setBounds(40,190,150,30);
			    lb4.setFont(new Font("serif",Font.BOLD,20));
			    lb.add(lb4);
			    
			    rlb3 = new JLabel();
			    rlb3.setBounds(200,190,300,30);
			    rlb3.setForeground(Color.GRAY);
			    rlb3.setFont(new Font("serif",Font.BOLD,20));
				lb.add(rlb3);
		        
				bt3 = new JButton("Remove");
				bt3.setBounds(40,300,120,30);
				bt3.setFont(new Font("serif",Font.BOLD,15));
				bt3.addActionListener(this);
				bt3.setBackground(Color.BLUE);
				bt3.setForeground(Color.white);
				lb.add(bt3);
				
				bt4 = new JButton("Cancel");
				bt4.setBounds(180,300,120,30);
				bt4.setFont(new Font("serif",Font.BOLD,15));
				bt4.setBackground(Color.red);
				bt4.setForeground(Color.white);
				bt4.addActionListener(this);
				lb.add(bt4);
		    
		    rframe1.add(lb);
			rframe1.setVisible(true);
			rframe1.setSize(620, 580);
			rframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			rframe1.setLocationRelativeTo(null);
		
		
		  lb2.setVisible(false); lb3.setVisible(false); lb4.setVisible(false);
		  bt3.setVisible(false); bt4.setVisible(false);
		 
			
	 }		

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt1) {
			try {
				 Conn con = new Conn();
				 String query = "select ename,mobileno,emailid from employee where employeeid = '"+tf1.getText()+"'";
				 ResultSet rs =con.st.executeQuery(query);
				 int i = 0;
				 if(rs.next()) {
					 String name = rs.getString(1);
					 String mobile = rs.getString(2);
					 String email = rs.getString(3);
					 
					 bt1.setVisible(false); 
					 bt2.setVisible(false);
					 lb2.setVisible(true); 
					 lb3.setVisible(true); 
					 lb4.setVisible(true);
					 bt3.setVisible(true); 
					 bt4.setVisible(true);
					 rlb1.setVisible(true);
					 rlb2.setVisible(true);
					 rlb3.setVisible(true);
					 
					 i=1;
					 rlb1.setText(name);
					 rlb2.setText(mobile);
					 rlb3.setText(email);
					 
				 }else if(i==0)
					 JOptionPane.showMessageDialog(null, "Employee Id not found or Deleted.");
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, e2);
			}
		} 
		
		if(e.getSource()==bt2) {
			rframe1.setVisible(false);
			new Details();
		}
		
		
		if(e.getSource()==bt3) {
			try {
				Conn con1 = new Conn();
				String query1 ="delete from employee where employeeid = '"+tf1.getText()+"'";
				con1.st.executeUpdate(query1);
				JOptionPane.showMessageDialog(null, "Removed Successfully.");
				
				
				  lb2.setVisible(false); lb3.setVisible(false); lb4.setVisible(false);
				  rlb1.setVisible(false); rlb2.setVisible(false); rlb3.setVisible(false);
				  bt3.setVisible(false); bt4.setVisible(false); bt1.setVisible(true);
				  bt2.setVisible(true);
				 
			} catch (Exception e3) {
				JOptionPane.showMessageDialog(null, "Problem occured:"+e3);
			}
		}
		 if(e.getSource()==bt4) {
			
			 bt1.setVisible(true); 
			 bt2.setVisible(true);
			 lb2.setVisible(false); 
			 lb3.setVisible(false); 
			 lb4.setVisible(false);
			 rlb1.setVisible(false);
			 rlb2.setVisible(false);
			 rlb3.setVisible(false);
			 
			 bt3.setVisible(false); 
			 bt4.setVisible(false);
			 
		}	
	}
		
}


