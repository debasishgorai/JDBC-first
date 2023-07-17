package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;

public class TestConnection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Driver driver= new Driver();
			//DriverManager.registerDriver(driver);
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
