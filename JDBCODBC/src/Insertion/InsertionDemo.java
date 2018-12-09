package Insertion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;



public class InsertionDemo 
{
	public static void main(String[] args) 
	{
		int salary=0,dno=0,a=0;
		String name = null,dname=null;
		try 
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sanket", "root", "");
			PreparedStatement pr=con.prepareStatement("insert into employee values(?,?,?,?,?)");
			//eno=Integer.parseInt(br.readLine());
			ResultSet r=pr.executeQuery("select max(eno) from employee");
			while(r.next()) {
				a=r.getInt(1);
			}
			a=a+1;
			System.out.print("Enter new Employee Name:");
			name=br.readLine();
			System.out.print("Enter Salary:");
			salary=Integer.parseInt(br.readLine());
			System.out.print("Enter Dept No:");
			dno=Integer.parseInt(br.readLine());
			System.out.print("Enter Dept Name:");
			dname=br.readLine();
			pr.setInt(1, a);
			pr.setString(2, name);
			pr.setInt(3, salary);
			pr.setInt(4,dno);
			pr.setString(5, dname);
			int n=pr.executeUpdate();
			System.out.println("rows"+n);
			System.out.println("Insertion Successful");
		}
		catch (Exception e) {
			System.out.println("Exception Raised \n Program Terminated");
		}
	}

}
