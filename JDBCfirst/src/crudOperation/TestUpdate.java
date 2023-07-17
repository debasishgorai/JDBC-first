package crudOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/m10_e3";
			String user="root";
			String pass="1234";
			Connection connection=DriverManager.getConnection(url, user, pass);
			Statement statement=connection.createStatement();
			String query= "update student set name='sky' where email='fg@mail.com'";
			int res= statement.executeUpdate(query);
			System.out.println(res);
			
			//String query="INSERT INTO student values"+"(2,'dev,'dev@gmail','maths')";
			boolean execute=statement.execute(query);
			System.out.println(execute);
			System.out.println("connected");
		}
		catch(ClassNotFoundException | SQLException e  ) {
			e.printStackTrace();
		}
	}

}
