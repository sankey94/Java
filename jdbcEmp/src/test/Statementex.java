package test;

import java.sql.*;

public class Statementex {
public static void main (String[] args) throws Exception 
{
		
	
Class.forName("com.mysql.jdbc.Driver");

Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
 Statement st=con.createStatement();
 ResultSet rs= st.executeQuery("select * from emp");
 while(rs.next())
 {
	 System.out.println(rs.getInt(1)+":");
	 System.out.println(rs.getString(2)+":");
	 System.out.println(rs.getInt(3)+":");
	 System.out.println(rs.getInt(4));
	 System.out.println();
 }
 
 rs.close();
 st.close();
 con.close();
	 
	}
	}
