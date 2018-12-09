package test;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;



public class Preparedex {
	public static void main(String [] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		PreparedStatement pr= con.prepareStatement("update emp set salary=? where empid=?");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee ID:");
		int empid=Integer.parseInt(br.readLine());
		System.out.println("Enter Employee New Salary:");
		int salary=Integer.parseInt(br.readLine());
		pr.setInt(1, salary);
		pr.setInt(2, empid);
		int n=pr.executeUpdate();
		System.out.println(n + "Cols Updated");
		br.close();
		pr.close();
		con.close();
	}
}


