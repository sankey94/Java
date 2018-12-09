package test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;


public class InsertDemo {
	public static void main(String [] args) throws Exception
	{
		int a=0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		PreparedStatement pr= con.prepareStatement("Insert into emp values(?,?,?,?)");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		/*System.out.println("Enter Employee ID:");
		int empid=Integer.parseInt(br.readLine());*/
		System.out.println("Enter Employee Name:");
		String empname=br.readLine();
		System.out.println("Enter Employee New Salary:");
		int salary=Integer.parseInt(br.readLine());
		System.out.println("Enter Employee Dno:");
		int dno=Integer.parseInt(br.readLine());
		ResultSet rs= pr.executeQuery("select max(empid) from emp");
		 while(rs.next()) {
			a=rs.getInt(1);
		 } 
		a=a+1;
	//	((PreparedStatement) rs).setInt(1, empid);
		pr.setInt(1, a);
		pr.setString(2, empname);
		pr.setInt(3, salary);		
		pr.setInt(4, dno);
		int n=pr.executeUpdate();
		System.out.println(n + "Cols Updated");
		br.close();
		pr.close();
		con.close();
	}

}
