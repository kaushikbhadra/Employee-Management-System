package com.kaushik.employee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AddEmployee implements ActionListener {

	JFrame AEFrame1;
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;
	JButton bt1,bt2;
	
	
	
	AddEmployee() {
		AEFrame1 = new JFrame("Add Employee");
		AEFrame1.setBackground(Color.white);
		AEFrame1.setLayout(null);
		
		ImageIcon imgIcon1 = new ImageIcon(ClassLoader.getSystemResource("com/kaushik/employee/Images/loginImg.jpg"));
	    Image img = imgIcon1.getImage().getScaledInstance(900,750,Image.SCALE_DEFAULT);
	    ImageIcon imgIcon2 = new ImageIcon(img);
	   
	    JLabel lb = new JLabel(imgIcon2);
	    lb.setBounds(0,0,900,750);

		
		
		lb1=new JLabel("New Employee Details");
		lb1.setBounds(320,30,500,50);
		lb1.setFont(new Font("serif",Font.ITALIC,25));
		lb1.setForeground(Color.BLACK);
		lb.add(lb1);
		
		
		lb2 = new JLabel("Name: ");
	    lb2.setBounds(50,150,150,30);
	    lb2.setFont(new Font("serif",Font.BOLD,20));
	    lb.add(lb2);
	    
	    tf1 = new JTextField(40);
		tf1.setBounds(200,150,170,30);
		lb.add(tf1);
		
		
		lb3 = new JLabel("Father Name: ");
		lb3.setBounds(50,200,150,30); 
		lb3.setFont(new Font("serif",Font.BOLD,20));
		lb.add(lb3);
		  
	    tf2 = new JTextField(40);
	    tf2.setBounds(200,200,170,30); 
	    lb.add(tf2);
	    
	    lb4 = new JLabel("Email Id: ");
		lb4.setBounds(50,250,150,30); 
		lb4.setFont(new Font("serif",Font.BOLD,20));
		lb.add(lb4);
		  
	    tf3 = new JTextField(40);
	    tf3.setBounds(200,250,170,30); 
	    lb.add(tf3);
	    
	    lb5 = new JLabel("Mobile No: ");
		lb5.setBounds(50,300,150,30); 
		lb5.setFont(new Font("serif",Font.BOLD,20));
		lb.add(lb5);
		  
	    tf4 = new JTextField(12);
	    tf4.setBounds(200,300,170,30); 
	    lb.add(tf4);
	    
	    lb6 = new JLabel("Address: ");
		lb6.setBounds(50,350,150,30); 
		lb6.setFont(new Font("serif",Font.BOLD,20));
		lb.add(lb6);
		  
	    tf5 = new JTextField(40);
	    tf5.setBounds(200,350,170,30); 
	    lb.add(tf5);
	    
	    lb7 = new JLabel("Education: ");
		lb7.setBounds(500,150,150,30); 
		lb7.setFont(new Font("serif",Font.BOLD,20));
		lb.add(lb7);
		  
	    tf6 = new JTextField(40);
	    tf6.setBounds(650,150,170,30); 
	    lb.add(tf6);
	    
	    lb8 = new JLabel("Job Description: ");
		lb8.setBounds(500,200,150,30); 
		lb8.setFont(new Font("serif",Font.BOLD,20));
		lb.add(lb8);
		  
	    tf7 = new JTextField(40);
	    tf7.setBounds(650,200,170,30); 
	    lb.add(tf7);
	    
	    lb9 = new JLabel("DateOfBirth: ");
		lb9.setBounds(500,250,150,30); 
		lb9.setFont(new Font("serif",Font.BOLD,20));
		lb.add(lb9);
		  
	    tf8 = new JTextField(40);
	    tf8.setBounds(650,250,170,30); 
	    lb.add(tf8);
	    
	    lb10 = new JLabel("Employee Id: ");
		lb10.setBounds(500,300,150,30); 
		lb10.setFont(new Font("serif",Font.BOLD,20));
		lb.add(lb10);
		  
	    tf9 = new JTextField(40);
	    tf9.setBounds(650,300,170,30); 
	    lb.add(tf9);
	    
	    bt1 = new JButton("Submit");
		bt1.setBounds(40,450,120,30);
		bt1.setFont(new Font("serif",Font.BOLD,15));
		bt1.addActionListener(this);
		bt1.setBackground(Color.BLUE);
		bt1.setForeground(Color.white);
		lb.add(bt1);
		
		bt2 = new JButton("Cancel");
		bt2.setBounds(180,450,120,30);
		bt2.setFont(new Font("serif",Font.BOLD,15));
		bt2.setBackground(Color.red);
		bt2.setForeground(Color.white);
		bt2.addActionListener(this);
		lb.add(bt2);
		
		
	    
		  
		
		AEFrame1.add(lb);
		AEFrame1.setVisible(true);
		AEFrame1.setSize(920, 780);
		AEFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AEFrame1.setLocationRelativeTo(null);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()== bt2) 
		  { 
				AEFrame1.setVisible(false);
				new Details();
		  }
		else {
			  		try {
			  			
				  			Conn con = new Conn();
							
							String name = tf1.getText();
							String FatherName = tf2.getText();
							String EmailId = tf3.getText();
							String MobileNo = tf4.getText();
							String Address = tf5.getText();
							String Education = tf6.getText();
							String JobDescription = tf7.getText();
							String DOB= tf8.getText();
							String EId = tf9.getText();
							
							String query = "Insert into Employee values('"+ EId +"','"+ name+"','"+FatherName +"','"+Address+"', '"+MobileNo+"','"+EmailId+"','"+Education+"','"+JobDescription+"','"+DOB+"')";
							 con.st.executeUpdate(query);
							
							
							JOptionPane.showMessageDialog(null, "Details Successfully Inserted.");
							AEFrame1.setVisible(false);
							new Details();
						
						
			  			}
			  		catch (Exception e1) {
			  								
			  								JOptionPane.showMessageDialog(null, e1);
			  							 }
			}

	}

	
}
