package jdbcDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class AltConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/m10_e3?user=root&password=1234";
//	String user="root";
//	String pass="1234";
	Connection connection=DriverManager.getConnection(url);
	System.out.println("connected");
	connection.close();
}
catch(ClassNotFoundException|SQLException e) {
	e.printStackTrace();
}
	
	}
}
