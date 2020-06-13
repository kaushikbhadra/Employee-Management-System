package com.kaushik.employee;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public  class Details implements ActionListener{
	
	JFrame Dframe1 ;
	JLabel Dlabel1,Dlabel2;
	JButton Dbutton1 ,Dbutton2,Dbutton3,Dbutton4,Dbutton5;
	
	Details(){

		Dframe1 = new JFrame("Employee Details");
		Dframe1.setBackground(Color.white);
		Dframe1.setLayout(null);
		
		
		ImageIcon imgIcon1 = new ImageIcon(ClassLoader.getSystemResource("com/kaushik/employee/Images/loginImg.jpg"));
	    Image img = imgIcon1.getImage().getScaledInstance(600,350,Image.SCALE_DEFAULT);
	    ImageIcon imgIcon2 = new ImageIcon(img);
	   
	    JLabel Llabel3 = new JLabel(imgIcon2);
	    Llabel3.setBounds(0,1,610,350);

	    

	    
		
		
		
		Dbutton1 = new JButton("ADD");
		Dbutton1.setBounds(40,40,120,40);
		Dbutton1.setFont(new Font("serif",Font.BOLD,15));
		Dbutton1.addActionListener(this);
		Dbutton1.setBackground(Color.BLUE);
		Dbutton1.setForeground(Color.white);
		Llabel3.add(Dbutton1);
		
		Dbutton2 = new JButton("REMOVE");
		Dbutton2.setBounds(180,40,120,40);
		Dbutton2.setFont(new Font("serif",Font.BOLD,15));
		Dbutton2.setBackground(Color.red);
		Dbutton2.setForeground(Color.white);
		Llabel3.add(Dbutton2);
		Dbutton2.addActionListener(this);
		
		Dbutton3 = new JButton("UPDATE");
		Dbutton3.setBounds(40,100,120,40);
		Dbutton3.setFont(new Font("serif",Font.BOLD,15));
		Dbutton3.setBackground(Color.BLACK);
		Dbutton3.setForeground(Color.white);
		Llabel3.add(Dbutton3);
		Dbutton3.addActionListener(this);
		
		Dbutton4 = new JButton("VIEW");
		Dbutton4.setBounds(180,100,120,40);
		Dbutton4.setFont(new Font("serif",Font.BOLD,15));
		Dbutton4.setBackground(Color.DARK_GRAY);
		Dbutton4.setForeground(Color.white);
		Llabel3.add(Dbutton4);
		Dbutton4.addActionListener(this);
		
		Dbutton5 = new JButton("BACK");
		Dbutton5.setBounds(40,250,120,40);
		Dbutton5.setFont(new Font("serif",Font.BOLD,15));
		Dbutton5.setBackground(Color.gray);
		Dbutton5.setForeground(Color.white);
		Llabel3.add(Dbutton5);
		Dbutton5.addActionListener(this);
		
		Dframe1.add(Llabel3);
		
		
		
		
		Dframe1.setVisible(true);
		Dframe1.setSize(620, 380);
		Dframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dframe1.setLocationRelativeTo(null);
		    
	        }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Dbutton1) {
			Dframe1.setVisible(false);
			new AddEmployee();
			
		} else if(e.getSource()==Dbutton2) {
			Dframe1.setVisible(false);
			new RemoveEmployee();
			
			
		} else if(e.getSource()==Dbutton3) {
			Dframe1.setVisible(false);
			new UpdateEmployee();
			
		}else if(e.getSource()==Dbutton4) {
			Dframe1.setVisible(false);
			new ViewEmployee();
			
		}else if(e.getSource()==Dbutton5) {
			Dframe1.setVisible(false);
			new Login();
			
		}
		
	}		
 
}
