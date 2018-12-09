package storedprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ScrollableUpdatebledemo {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		CallableStatement cs=con.prepareCall("{call deptnm(?,?)}");
		cs.setString(1,"sanket");
		cs.registerOutParameter(2,java.sql.Types.VARCHAR);
		cs.executeQuery();
		String deptname=cs.getString(2);
		System.out.println(deptname);


	}

}
