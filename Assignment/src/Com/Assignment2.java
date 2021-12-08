package Com;
import java.sql.*;
import java.io.*;
import java.lang.*;

public class Assignment2 {
	
	public static void main(String args[])throws Exception{
	System.out.println("MySQL Connect Example.");
	Connection conn = null;
	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "author";
	String driver = "com.mysql.cj.jdbc.Driver";
	String userName = "root";
	String password = "";
	Class.forName(driver);
	conn = DriverManager.getConnection(url+dbName,userName,password);
	System.out.println("Connected to the database");
	String ID,FNAME,MNAME,LNAME,PHNO;
	PreparedStatement ps=conn.prepareStatement("insert into author values(?,?,?,?,?)");
	Statement stmt = conn.createStatement();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	do{
	//int id=Integer.parseInt(br.readLine());
	//float salary=Float.parseFloat(br.readLine());
	//ps.setFloat(2, salary);
	System.out.println("Enter AuthorID:");
	ID=br.readLine();
	System.out.println("Enter FirstName:");
	FNAME=br.readLine();
	System.out.println("Enter MiddleName:");
	MNAME=br.readLine();
	System.out.println("Enter LastName:");
	LNAME=br.readLine();
	System.out.println("Enter PhoneNo:");
	PHNO=br.readLine();
	ps.setString(1,ID);
	ps.setString(2,FNAME);
	ps.setString(3,MNAME);
	ps.setString(4,LNAME);
	ps.setString(5,PHNO);
	int i=ps.executeUpdate();
	System.out.println(i+" records added");
	System.out.println("Do you want to continue: y/n");
	String s=br.readLine();
	if(s.startsWith("n")){
	break;
	}
	}while(true);
	String sql = "SELECT * from author1";
	ResultSet rs = stmt.executeQuery(sql);
	System.out.println("The records are :");
	while (rs.next())
	{
	ID = rs.getString(1);
	FNAME=rs.getString(2);
	MNAME=rs.getString(3);
	LNAME=rs.getString(4);
	PHNO=rs.getString(5);
	System.out.println(rs.getRow()+"-"+ID+" "+FNAME+" "+MNAME+""+LNAME+""+PHNO);
	} //end while
	conn.close();
	}
	}


