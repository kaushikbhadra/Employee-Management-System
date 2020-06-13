package com.kaushik.employee;

import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class Login implements ActionListener{
	
	JFrame Lframe1 ;
	JLabel Llabel1,Llabel2;
	JTextField Ltfd1 ;
	JPasswordField Ltpfd1;
	JButton Lbutton1 ,Lbutton2;
	
	Login(){
		Lframe1 = new JFrame("Login");
		Lframe1.setBackground(Color.white);
		Lframe1.setLayout(null);
		
		
		ImageIcon imgIcon1 = new ImageIcon(ClassLoader.getSystemResource("com/kaushik/employee/Images/loginImg.jpg"));
	    Image img = imgIcon1.getImage().getScaledInstance(600,350,Image.SCALE_DEFAULT);
	    ImageIcon imgIcon2 = new ImageIcon(img);
	    JLabel Llabel3 = new JLabel(imgIcon2);
	    Llabel3.setBounds(0,1,610,350);
	   // Lframe1.add(Llabel3);
	    

	    
		Llabel1 = new JLabel("Username");
	    Llabel1.setBounds(40,20,200,30);
	    Llabel3.add(Llabel1);
	    
	    Llabel2 = new JLabel("Password");
	    Llabel2.setBounds(40,70,200,30);
		Llabel3.add( Llabel2);
		
		Ltfd1 = new JTextField(20);
		Ltfd1.setBounds(150,20,150,30);
		Llabel3.add(Ltfd1);
		
		Ltpfd1 = new JPasswordField(20);
		Ltpfd1.setBounds(150,70,150,30);
		Llabel3.add(Ltpfd1);
		
		Lbutton1 = new JButton("Login");
		Lbutton1.setBounds(40,140,120,30);
		Lbutton1.setFont(new Font("serif",Font.BOLD,15));
		Lbutton1.addActionListener(this);
		Lbutton1.setBackground(Color.BLUE);
		Lbutton1.setForeground(Color.white);
		Llabel3.add(Lbutton1);
		
		Lbutton2 = new JButton("Cancel");
		Lbutton2.setBounds(180,140,120,30);
		Lbutton2.setFont(new Font("serif",Font.BOLD,15));
		Lbutton2.setBackground(Color.red);
		Lbutton2.setForeground(Color.white);
		Llabel3.add(Lbutton2);
		Lbutton2.addActionListener(this);
		
		Lframe1.add(Llabel3);
		
		
		
		
		Lframe1.setVisible(true);
		Lframe1.setSize(620, 380);
		Lframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Lframe1.setLocationRelativeTo(null);
	}
	

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== Lbutton2) { System.exit(0);}
		if(e.getSource()== Lbutton1) {
					try {
						Conn con = new Conn();
						
						String user = Ltfd1.getText();
						char [] ps = Ltpfd1.getPassword();
						String psw = new String(ps);
						
						String query = "select * from login where username = '"+user+"' and password = '"+psw+"'";
						ResultSet rs = con.st.executeQuery(query);
						int i=0;
						if(rs.next()) {
							
							new Details().Dframe1.setVisible(true);
							Lframe1.setVisible(false);
							i=1;
				         } 
						
					  if(i==0) {
					JOptionPane.showMessageDialog(null, "Invalid Login");
					Lframe1.setVisible(false);
					new Login();
					  }
					  
					  
					  
					 
					}
					catch (Exception e1) {
						e1.printStackTrace();
						
					}
					
		}
		
	}
	

	
}
