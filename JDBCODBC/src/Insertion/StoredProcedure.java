package Insertion;
import java.sql.*;

public class StoredProcedure 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sanket", "root", "");
		PreparedStatement pr=con.prepareStatement();
	
	
	
	
	
	}
}
