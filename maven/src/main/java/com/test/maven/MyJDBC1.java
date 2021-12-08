package com.test.maven;
import java.sql.*;

public class MyJDBC1 {

	public static void main(String[] args) {
		Connection con;
		Statement s;
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
            s=con.createStatement();
            ResultSet r;
            r=s.executeQuery("Select * from student");
            while(r.next())
            {
            	System.out.println(r.getString("name")+"\t"+r.getInt("id"));
			}
		
		}
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
		// TODO Auto-generated method stub

	}

}
