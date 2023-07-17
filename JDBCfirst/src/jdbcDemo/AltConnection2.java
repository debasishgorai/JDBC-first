package jdbcDemo;
import java.sql.*;
import java.util.Properties;
public class AltConnection2 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/m10_e3";
	Properties pro=new Properties();
	pro.setProperty("user", "root");
	pro.setProperty("password", "1234");
	Connection connection= DriverManager.getConnection(url,pro
			);
	System.out.println("connected");
	connection.close();
	
	
	}
catch(ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}

}
}