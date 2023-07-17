package crudOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/m10_e3";
	String user="root";
	String pass="1234";
	Connection connection=DriverManager.getConnection(url, user, pass);
	Statement statement=connection.createStatement();
	String query="INSERT INTO student VALUES(8,'priya','priya@gmail','maths')";
	
	ResultSet set= statement.getResultSet();

	String query2="INSERT INTO student values(1,'komol','devf@gmail.com','biology')";
	boolean execute=statement.execute(query2);	System.out.println(execute);
	System.out.println("connected");
	ResultSet set1= statement.getResultSet();
	System.out.println(set1);
    while(set1.next()) {
	
	System.out.println(set1.getInt(1)+"/t");
	System.out.println(set1.getString(2));
	System.out.println(set1.getString(3));
	System.out.println(set1.getString(4));
	//System.out.println(set.getNString(0));
	
    }
	
}
catch(ClassNotFoundException | SQLException e  ) {
	e.printStackTrace();
}
	}

}
