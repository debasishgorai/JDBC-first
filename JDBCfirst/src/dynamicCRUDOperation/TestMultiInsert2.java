package dynamicCRUDOperation;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class TestMultiInsert2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub



try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/m10_e3";
	FileInputStream stream = new FileInputStream("mydbinfo.properties");
	String user="root";
	String pass="1234";
	Properties pro= new Properties();
	pro.load(stream);
	Connection con=DriverManager.getConnection(url,pro);
	Statement statement=con.createStatement();

	String query="INSERT INTO student values(?,?,?,?)";
	PreparedStatement ps= con.prepareStatement(query);
	ps.setInt(1, 567);
	ps.setString(2, "567");
	ps.setString(3, "5675nb@gmail.com");
	ps.setString(4, "tre");
	ps.addBatch();
	ps.setInt(1, 560);
	ps.setString(2, "560");
	ps.setString(3, "5605nb@gmail.com");
	ps.setString(4, "tree");
	ps.addBatch();
	ps.setInt(1, 5690);
	ps.setString(2, "5690");
	ps.setString(3, "5690nb@gmail.com");
	ps.setString(4, "tree");
	ps.addBatch();
	int[] eb = ps.executeBatch();
	System.out.println(eb.length+" no of rows inserted");
	con.close();


	
	
	}
catch(ClassNotFoundException | SQLException e  ) {
	e.printStackTrace();
}

	
	
	
	
	
	
	
	
	
	
	

	}

	
		
	}


