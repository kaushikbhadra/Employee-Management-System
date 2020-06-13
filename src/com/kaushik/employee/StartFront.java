package com.kaushik.employee;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class StartFront implements ActionListener {

	JFrame  frame1;
	JLabel  lable1;
	JButton button1;
	
	 StartFront() {
		frame1 = new JFrame("Employee Management System");
		frame1.setBackground(Color.blue);
		frame1.setLayout(null);
		
		lable1 =new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		lable1.setBounds(40,20,600,100);
		lable1.setForeground(Color.blue);
		lable1.setFont(new Font("serif",Font.PLAIN,30));
		frame1.add(lable1);
		
		button1 = new JButton("CLICK HERE");
		button1.setBackground(Color.blue);
		button1.setForeground(Color.white);
		button1.setBounds(220,200,160,50);
		button1.addActionListener(this);
		frame1.add(button1);
		
		// Change Frame background colour
		frame1.getContentPane().setBackground(Color.white);
		
		// Show Frame
		frame1.setVisible(true);
		frame1.setSize(600, 350);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			frame1.setVisible(false);
			 new Login();
		}
		
	}
	
}
