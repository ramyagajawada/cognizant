package DataBase;
import java.sql.*;

public class OracleConnectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from employees");
	while(rs.next())
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	con.close();
}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
}
	

