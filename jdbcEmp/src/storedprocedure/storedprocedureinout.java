package storedprocedure;

import java.sql.Connection;
import java.sql.*;




public class storedprocedureinout {
	public static void main(String args[]) throws Exception  {
		int empid=2;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		CallableStatement cs=con.prepareCall("{call getdept(?)}");
		cs.setInt(1,empid);
		cs.registerOutParameter(1,java.sql.Types.INTEGER);
		cs.executeQuery();
		int deptno=cs.getInt(1);
		System.out.println(deptno);
		
		
		
		
		
	}

}
