package storedprocedure;



import java.sql.*;



public class StoredProc1 {
	
	public static void main(String args[]) throws Exception {
		//int empno=1;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		CallableStatement cs=con.prepareCall("{call get_sal(?,?)}");
		cs.setInt(1,1);
		cs.registerOutParameter(2, java.sql.Types.INTEGER);
		cs.executeQuery();
		float sal=cs.getInt(2);
		System.out.println(sal);
	}

}
