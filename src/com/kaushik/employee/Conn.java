package com.kaushik.employee;
import java.sql.*;

public class Conn {

	public Connection con;
	public Statement st;
	
	public Conn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");//("jdbc:mysql://localhost:3306/projectjava?autoReconnect=true&useSSL=false","root","1234")
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectjava?autoReconnect=true&useSSL=false","root","1234");
			st = con.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
