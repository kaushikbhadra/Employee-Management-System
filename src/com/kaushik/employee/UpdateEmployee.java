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

public class UpdateEmployee implements ActionListener {

	JFrame uframe1;
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10;
	JButton bt1,bt2,bt3,bt4;
	
	UpdateEmployee() {
		    uframe1 = new JFrame("Update Employee Detail");
			uframe1.setBackground(Color.white);
			uframe1.setLayout(null);
			
			ImageIcon imgIcon1 = new ImageIcon(ClassLoader.getSystemResource("com/kaushik/employee/Images/loginImg.jpg"));
		    Image img = imgIcon1.getImage().getScaledInstance(900,750,Image.SCALE_DEFAULT);
		    ImageIcon imgIcon2 = new ImageIcon(img);
		    JLabel lb = new JLabel(imgIcon2);
		    lb.setBounds(0,0,900,750);
		    
		
		  lb11 = new JLabel("Employee ID: "); 
		  lb11.setBounds(40,50,150,30);
		  lb11.setFont(new Font("serif",Font.BOLD,20));
		  lb.add(lb11);
		  
		  tf10 = new JTextField(40); 
		  tf10.setBounds(200,50,170,30);
		  lb.add(tf10);
		 
			
			
			
			lb10=new JLabel("Update Employee Details");
			lb10.setBounds(300,30,500,50);
			lb10.setFont(new Font("serif",Font.ITALIC,25));
			lb10.setForeground(Color.BLACK);
			lb.add(lb10);
			
			lb1 = new JLabel("Employee Id: ");
			lb1.setBounds(40,100,150,30); 
			lb1.setFont(new Font("serif",Font.BOLD,20));
			lb.add(lb1);
			  
		
			tf9 = new JTextField(40); 
			tf9.setBounds(180,100,170,30); 
			lb.add(tf9);
		 
			lb2 = new JLabel("Name: ");
		    lb2.setBounds(40,150,150,30);
		    lb2.setFont(new Font("serif",Font.BOLD,20));
		    lb.add(lb2);
		    
		    tf1 = new JTextField(40);
			tf1.setBounds(180,150,170,30);
			lb.add(tf1);
			
			
			lb3 = new JLabel("Father Name: ");
			lb3.setBounds(40,200,150,30); 
			lb3.setFont(new Font("serif",Font.BOLD,20));
			lb.add(lb3);
			  
		    tf2 = new JTextField(40);
		    tf2.setBounds(180,200,170,30); 
		    lb.add(tf2);
		    
		    lb4 = new JLabel("Email Id: ");
			lb4.setBounds(40,250,150,30); 
			lb4.setFont(new Font("serif",Font.BOLD,20));
			lb.add(lb4);
			  
		    tf3 = new JTextField(40);
		    tf3.setBounds(180,250,170,30); 
		    lb.add(tf3);
		    
		    lb5 = new JLabel("Mobile No: ");
			lb5.setBounds(40,300,150,30); 
			lb5.setFont(new Font("serif",Font.BOLD,20));
			lb.add(lb5);
			  
		    tf4 = new JTextField(12);
		    tf4.setBounds(180,300,170,30); 
		    lb.add(tf4);
		    
		    lb6 = new JLabel("Address: ");
			lb6.setBounds(40,350,150,30); 
			lb6.setFont(new Font("serif",Font.BOLD,20));
			lb.add(lb6);
			  
		    tf5 = new JTextField(40);
		    tf5.setBounds(180,350,170,30); 
		    lb.add(tf5);
		    
		    lb7 = new JLabel("Education: ");
			lb7.setBounds(400,100,150,30); 
			lb7.setFont(new Font("serif",Font.BOLD,20));
			lb.add(lb7);
			  
		    tf6 = new JTextField(40);
		    tf6.setBounds(550,100,170,30); 
		    lb.add(tf6);
		    
		    lb8 = new JLabel("Job Description: ");
			lb8.setBounds(400,150,150,30); 
			lb8.setFont(new Font("serif",Font.BOLD,20));
			lb.add(lb8);
			  
		    tf7 = new JTextField(40);
		    tf7.setBounds(550,150,170,30); 
		    lb.add(tf7);
		    
		    lb9 = new JLabel("DateOfBirth: ");
			lb9.setBounds(400,200,150,30); 
			lb9.setFont(new Font("serif",Font.BOLD,20));
			lb.add(lb9);
			  
		    tf8 = new JTextField(40);
		    tf8.setBounds(550,200,170,30); 
		    lb.add(tf8);
			
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
		
		  bt3 = new JButton("Update"); 
		  bt3.setBounds(40,450,120,30); 
		  bt3.setFont(new Font("serif",Font.BOLD,15)); 
		  bt3.addActionListener(this);
		  bt3.setBackground(Color.BLUE);
		  bt3.setForeground(Color.white); 
		  lb.add(bt3);
		  
		  bt4 = new JButton("Cancel"); 
		  bt4.setBounds(180,450,120,30); 
		  bt4.setFont(new Font("serif",Font.BOLD,15)); 
		  bt4.setBackground(Color.red);
		  bt4.setForeground(Color.white); 
		  bt4.addActionListener(this); 
		  lb.add(bt4);
		 
				
				
			    
			    
		    uframe1.add(lb);
			uframe1.setVisible(true);
			uframe1.setSize(920, 780);
			uframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			uframe1.setLocationRelativeTo(null);
		
		
		  lb1.setVisible(false); 
		  lb2.setVisible(false); 
		  lb3.setVisible(false); 
		  lb4.setVisible(false);
		  lb5.setVisible(false);
		  lb6.setVisible(false);
		  lb7.setVisible(false);
		  lb8.setVisible(false);
		  lb9.setVisible(false);
		  lb10.setVisible(false);
		  tf1.setVisible(false);
		  tf2.setVisible(false);
		  tf3.setVisible(false);
		  tf4.setVisible(false);
		  tf5.setVisible(false);
		  tf6.setVisible(false);
		  tf7.setVisible(false);
		  tf8.setVisible(false);
		  tf9.setVisible(false);
		  bt3.setVisible(false); 
		  bt4.setVisible(false);
		 
		 
			
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==bt1) {
			try {
				 Conn con = new Conn();
				 String query = "select * from employee where employeeid = '"+tf10.getText()+"'";
				 ResultSet rs =con.st.executeQuery(query);
				 int i = 0;
				 if(rs.next()) {
					    String EId = rs.getString(1);
					    String name = rs.getString(2);
						String FatherName = rs.getString(3);
						String EmailId = rs.getString(6);
						String MobileNo = rs.getString(5);
						String Address = rs.getString(4);
						String Education = rs.getString(7);
						String JobDescription = rs.getString(8);
						String DOB= rs.getString(9);
						
					  lb11.setVisible(false);
					  tf10.setVisible(false);
					  bt1.setVisible(false); 
					  bt2.setVisible(false);
					  
					  lb1.setVisible(true); 
					  lb2.setVisible(true); 
					  lb3.setVisible(true); 
					  lb4.setVisible(true);
					  lb5.setVisible(true);
					  lb6.setVisible(true);
					  lb7.setVisible(true);
					  lb8.setVisible(true);
					  lb9.setVisible(true);
					  lb10.setVisible(true);
					  tf1.setVisible(true);
					  tf2.setVisible(true);
					  tf3.setVisible(true);
					  tf4.setVisible(true);
					  tf5.setVisible(true);
					  tf6.setVisible(true);
					  tf7.setVisible(true);
					  tf8.setVisible(true);
					  tf9.setVisible(true);
					  bt3.setVisible(true); 
					  bt4.setVisible(true);
					 
					 i=1;
					 tf9.setText(EId);
					 tf1.setText(name);
					 tf2.setText(FatherName);
					 tf3.setText(EmailId);
					 tf4.setText(MobileNo);
					 tf5.setText(Address);
					 tf6.setText(Education);
					 tf7.setText(JobDescription);
					 tf8.setText(DOB);
					
					 
					 
				 }else if(i==0) {
					 JOptionPane.showMessageDialog(null, "Employee Id not found or Deleted.");
					 
				 }
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, e2);
			}
		}
	
		if(e.getSource()==bt2) {
			uframe1.setVisible(false);
			new Details();
		}
		
		if(e.getSource()==bt3) {
			 try {
				 
				 Conn con1 = new Conn();
				 String query1 = "update employee set  employeeid = '"+tf9.getText()+"', ename = '"+tf1.getText()+"', efathername = '"+tf2.getText()+"' ,emailid = '"+tf3.getText()+"', "
				 		+ "mobileno = '"+tf4.getText()+"', address = '"+tf5.getText()+"', education = '"+tf6.getText()+"', jobdescription = '"+tf7.getText()+"', dateofbirth= '"+tf8.getText()+"'";
				 con1.st.executeUpdate(query1);
				 JOptionPane.showMessageDialog(null, "Update Successfully.");
				  lb1.setVisible(false); 
				  lb2.setVisible(false); 
				  lb3.setVisible(false); 
				  lb4.setVisible(false);
				  lb5.setVisible(false);
				  lb6.setVisible(false);
				  lb7.setVisible(false);
				  lb8.setVisible(false);
				  lb9.setVisible(false);
				  lb10.setVisible(false);
				  tf1.setVisible(false);
				  tf2.setVisible(false);
				  tf3.setVisible(false);
				  tf4.setVisible(false);
				  tf5.setVisible(false);
				  tf6.setVisible(false);
				  tf7.setVisible(false);
				  tf8.setVisible(false);
				  tf9.setVisible(false);
				  bt3.setVisible(false); 
				  bt4.setVisible(false);
				  
				  lb11.setVisible(true);
				  tf10.setVisible(true);
				  bt1.setVisible(true); 
				  bt2.setVisible(true);
				 
				 
				 
			} catch (Exception e3) {
				JOptionPane.showMessageDialog(null, e3);
			}
			
		}
		
		if(e.getSource()==bt4) {
			
			  lb1.setVisible(false); 
			  lb2.setVisible(false); 
			  lb3.setVisible(false); 
			  lb4.setVisible(false);
			  lb5.setVisible(false);
			  lb6.setVisible(false);
			  lb7.setVisible(false);
			  lb8.setVisible(false);
			  lb9.setVisible(false);
			  lb10.setVisible(false);
			  tf1.setVisible(false);
			  tf2.setVisible(false);
			  tf3.setVisible(false);
			  tf4.setVisible(false);
			  tf5.setVisible(false);
			  tf6.setVisible(false);
			  tf7.setVisible(false);
			  tf8.setVisible(false);
			  tf9.setVisible(false);
			  bt3.setVisible(false); 
			  bt4.setVisible(false);
			  
			  lb11.setVisible(true);
			  tf10.setVisible(true);
			  bt1.setVisible(true); 
			  bt2.setVisible(true);
			 
		}

	}

	

}
