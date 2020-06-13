package com.kaushik.employee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class ViewEmployee implements ActionListener {
	
	
	JFrame vframe1;
	JLabel lb1;
	JTextField tf1;
	JButton bt1,bt2;
	
	 ViewEmployee() {
		    vframe1 = new JFrame("View Employee");
			vframe1.setBackground(Color.white);
			vframe1.setLayout(null);
			
			ImageIcon imgIcon1 = new ImageIcon(ClassLoader.getSystemResource("com/kaushik/employee/Images/loginImg.jpg"));
		    Image img = imgIcon1.getImage().getScaledInstance(600,350,Image.SCALE_DEFAULT);
		    ImageIcon imgIcon2 = new ImageIcon(img);
		    JLabel lb = new JLabel(imgIcon2);
		    lb.setBounds(0,1,610,350);
		    
		    lb1 = new JLabel("Employee ID: ");
		    lb1.setBounds(50,100,150,30);
		    lb1.setFont(new Font("serif",Font.BOLD,20));
		    lb.add(lb1);
		    
		    tf1 = new JTextField(40);
			tf1.setBounds(200,100,170,30);
			lb.add(tf1);
		    
			 bt1 = new JButton("Search");
				bt1.setBounds(40,180,120,30);
				bt1.setFont(new Font("serif",Font.BOLD,15));
				bt1.addActionListener(this);
				bt1.setBackground(Color.BLUE);
				bt1.setForeground(Color.white);
				lb.add(bt1);
				
				bt2 = new JButton("Cancel");
				bt2.setBounds(180,180,120,30);
				bt2.setFont(new Font("serif",Font.BOLD,15));
				bt2.setBackground(Color.red);
				bt2.setForeground(Color.white);
				bt2.addActionListener(this);
				lb.add(bt2);
				
		    
		    
		    
		    vframe1.add(lb);
			vframe1.setVisible(true);
			vframe1.setSize(620, 380);
			vframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			vframe1.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== bt2) 
		  { 
				vframe1.setVisible(false);
				new Details();
		  }
		else {
			
			vframe1.setVisible(false);
			new ShowEmployeeDetail(tf1.getText());
		}
		
	}

	
}
