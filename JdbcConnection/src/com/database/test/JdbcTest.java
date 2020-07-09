package com.database.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;  

class JdbcTest
{
	public static void main(String args[])
	{
		 System.out.println("hhiiiiiii");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbs", "root", "password");
			// here sonoo is database name, root is username and password//////////// dbs is the db name
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tab");// tab is table name
			while (rs.next())
				
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) +"   "+rs.getString(4));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
} 

