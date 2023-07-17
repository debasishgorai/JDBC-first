package jdbcDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/m10_e3";
	String user="root";
	String pass="1234";
	Connection connection=DriverManager.getConnection(url,user,pass);
	System.out.println("connected");
}
catch(ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}
	}

}
