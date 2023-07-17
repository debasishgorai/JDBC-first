package jdbcDemo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AltConnection3 {

	public static void main(String[] args)  throws IOException, SQLException{
		// TODO Auto-generated method stub
try {

	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/m10_e3";
	FileInputStream stream= new FileInputStream ("mydbinfo.properties");
	Properties pro = new Properties();
	pro.load(stream);
	Connection connection =DriverManager.getConnection(url,pro);
	System.out.println("coonected");
}

catch(ClassNotFoundException | IOException e) {
	e.printStackTrace();
	
}}
}
