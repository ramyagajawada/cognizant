package DataBase;
import java.sql.*;

public class Exammple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	PreparedStatement stmt=con.prepareStatement("insert into countries values(?,?,?)");
	stmt.setInt(1, 1);
	stmt.setString(2,"ram");
	stmt.setInt(3,1);
	
	int i=stmt.executeUpdate();
	System.out.println(i+"records inserted");
	con.close();
	
}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
}
	

