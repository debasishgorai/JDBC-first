package dynamicCRUDOperation;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class TestInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/m10_e3";
		FileInputStream stream= new FileInputStream("mydbinfo.properties");
		Properties pro= new Properties();
		pro.load(stream);

		Connection con = DriverManager.getConnection(url,pro);
		String query="INSERT INTO student values(?,?,?,?)";
		PreparedStatement ps= con.prepareStatement(query);
		ps.setInt(1, 13);
		ps.setString(2, "hrtt67rtik");
		ps.setString(3, "fr45nb@gmail.com");
		ps.setString(4, "Sql");
		int res= ps.executeUpdate();
		System.out.println(res+"row of data inserted");
		con.close();
	}

catch(IOException | ClassNotFoundException | SQLException e) {
	e.printStackTrace();
	}
	}{}
}
