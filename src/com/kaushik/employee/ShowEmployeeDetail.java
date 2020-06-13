package com.kaushik.employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ShowEmployeeDetail implements ActionListener {
	
	JFrame sframe1;
	JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,slb1,slb2,slb3,slb4,slb5,slb6,slb7,slb8,slb9,slb10;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;
	JButton bt1,bt2;
	String eid ,name, FatherName, EmailId, MobileNo , Address, Education , JobDescription , DOB;
	
	
	 ShowEmployeeDetail(String empid) {
		
		 try {
			Conn con = new Conn();
			String query = "select * from employee where employeeid = '"+empid+"'";
			ResultSet rs = con.st.executeQuery(query);
			while(rs.next()) {
				eid = rs.getString("employeeid");
				name = rs.getString("EName");
				FatherName = rs.getString("EFatherName");
				EmailId = rs.getString("EmailID");
				MobileNo = rs.getString("MobileNo");
				Address = rs.getString("Address");
				Education = rs.getString("Education");
				JobDescription = rs.getString("JobDescription");
				DOB = rs.getString("DateOfBirth");
				
			}
			
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		 if(empid.equals(eid)) {
		   sframe1 = new JFrame("Detail of Employee");
		   sframe1.setBackground(Color.white);
		   sframe1.setLayout(null);	 
		   
		   
		    ImageIcon imgIcon1 = new ImageIcon(ClassLoader.getSystemResource("com/kaushik/employee/Images/loginImg.jpg"));
		    Image img = imgIcon1.getImage().getScaledInstance(900,750,Image.SCALE_DEFAULT);
		    ImageIcon imgIcon2 = new ImageIcon(img);
		   
		    JLabel lb = new JLabel(imgIcon2);
		    lb.setBounds(0,0,900,750);
		    
		    lb1=new JLabel(" Employee Detail");
			lb1.setBounds(320,30,500,50);
			lb1.setFont(new Font("serif",Font.ITALIC,25));
			lb1.setForeground(Color.BLACK);
			lb.add(lb1);
		    
			lb2 = new JLabel("Employee ID: ");
		    lb2.setBounds(50,150,150,30);
		    lb2.setFont(new Font("serif",Font.BOLD,20));
		    lb.add(lb2);
		    
		    slb1 = new JLabel(eid);
		    slb1.setBounds(200,150,170,30);
			slb1.setForeground(Color.GRAY);
		    slb1.setFont(new Font("serif",Font.BOLD,20));
			lb.add(slb1);
			
			lb3 = new JLabel("Name: ");
		    lb3.setBounds(50,200,150,30);
		    lb3.setFont(new Font("serif",Font.BOLD,20));
		    lb.add(lb3);
		    
		    slb2 = new JLabel(name);
		    slb2.setBounds(200,200,170,30);
		    slb2.setForeground(Color.GRAY);
		    slb2.setFont(new Font("serif",Font.BOLD,20));
			lb.add(slb2);
			
			lb4 = new JLabel("Father Name: ");
		    lb4.setBounds(50,250,150,30);
		    lb4.setFont(new Font("serif",Font.BOLD,20));
		    lb.add(lb4);
		    
		    slb3 = new JLabel(FatherName);
		    slb3.setBounds(200,250,200,30);
		    slb3.setForeground(Color.GRAY);
		    slb3.setFont(new Font("serif",Font.BOLD,20));
			lb.add(slb3);
			
			lb5 = new JLabel("EmailID: ");
		    lb5.setBounds(50,300,150,30);
		    lb5.setFont(new Font("serif",Font.BOLD,20));
		    lb.add(lb5);
		    
		    slb4 = new JLabel(EmailId);
		    slb4.setBounds(200,300,300,30);
		    slb4.setForeground(Color.GRAY);
		    slb4.setFont(new Font("serif",Font.BOLD,20));
			lb.add(slb4);
			
			lb6 = new JLabel("Mobile Number: ");
		    lb6.setBounds(50,350,150,30);
		    lb6.setFont(new Font("serif",Font.BOLD,20));
		    lb.add(lb6);
		    
		    slb5 = new JLabel(MobileNo);
		    slb5.setBounds(200,350,170,30);
		    slb5.setForeground(Color.GRAY);
		    slb5.setFont(new Font("serif",Font.BOLD,20));
			lb.add(slb5);
			
			lb7 = new JLabel("Address: ");
		    lb7.setBounds(50,400,150,30);
		    lb7.setFont(new Font("serif",Font.BOLD,20));
		    lb.add(lb7);
		    
		    slb6 = new JLabel(Address);
		    slb6.setBounds(200,400,170,30);
		    slb6.setForeground(Color.GRAY);
		    slb6.setFont(new Font("serif",Font.BOLD,20));
			lb.add(slb6);
			
			lb8 = new JLabel("Education: ");
		    lb8.setBounds(50,450,150,30);
		    lb8.setFont(new Font("serif",Font.BOLD,20));
		    lb.add(lb8);
		    
		    slb7 = new JLabel(Education);
		    slb7.setBounds(200,450,170,30);
		    slb7.setForeground(Color.GRAY);
		    slb7.setFont(new Font("serif",Font.BOLD,20));
			lb.add(slb7);
		    
			lb9 = new JLabel("Job Description: ");
		    lb9.setBounds(50,500,150,30);
		    lb9.setFont(new Font("serif",Font.BOLD,20));
		    lb.add(lb9);
		    
		    slb8 = new JLabel(JobDescription);
		    slb8.setBounds(200,500,170,30);
		    slb8.setForeground(Color.GRAY);
		    slb8.setFont(new Font("serif",Font.BOLD,20));
			lb.add(slb8);
			
			lb10 = new JLabel("DateOfBirth: ");
		    lb10.setBounds(50,550,150,30);
		    lb10.setFont(new Font("serif",Font.BOLD,20));
		    lb.add(lb10);
		    
		    slb9 = new JLabel(DOB);
		    slb9.setBounds(200,550,170,30);
		    slb9.setForeground(Color.GRAY);
		    slb9.setFont(new Font("serif",Font.BOLD,20));
			lb.add(slb9);
		    
			bt1 = new JButton("Print");
			bt1.setBounds(50,600,120,30);
			bt1.setFont(new Font("serif",Font.BOLD,15));
			bt1.addActionListener(this);
			bt1.setBackground(Color.BLUE);
			bt1.setForeground(Color.white);
			lb.add(bt1);
			
			bt2 = new JButton("Cancel");
			bt2.setBounds(180,600,120,30);
			bt2.setFont(new Font("serif",Font.BOLD,15));
			bt2.setBackground(Color.red);
			bt2.setForeground(Color.white);
			bt2.addActionListener(this);
			lb.add(bt2);
			
		    
		    sframe1.add(lb);
			sframe1.setVisible(true);
			sframe1.setSize(920, 780);
			sframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			sframe1.setLocationRelativeTo(null);	
			
		 }
		 else {
			 JOptionPane.showMessageDialog(null, "Invalid Employee ID");
			 new Details();
		 }
		 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== bt2) 
		  { 
				sframe1.setVisible(false);
				new ViewEmployee();
		  }
		else {
			JOptionPane.showMessageDialog(null, "Printed Successfully.");
			sframe1.setVisible(false);
			new ViewEmployee();
		}

	}
	
}
