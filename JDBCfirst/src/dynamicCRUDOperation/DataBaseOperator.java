package dynamicCRUDOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the query");
Scanner sc= new Scanner(System.in);
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/m10_e3";
	String user="root";
	String pass="1234";
	String query= sc.nextLine();
	Connection connection=DriverManager.getConnection(url, user, pass);
	Statement statement=connection.createStatement();
	//String query= "update student set name='sky' where email='fg@mail.com'";
	//int res= statement.executeUpdate(query);
	//System.out.println(res);
	
	String query2="INSERT INTO student values(1,'komol','devf@gmail.com','biology')";
//	boolean execute=statement.execute(query2);
//	System.out.println(execute);
	System.out.println("connected");
	ResultSet set= statement.getResultSet();
	System.out.println(set);
	
	//jdbc is an API ,it is used to connect the java program with database, it is used to convert java object
//to database understable values and java understandable Objects.			
//		by using jdbc Api we can perform operation from java prgms.
	// jdbc stands for java Database Connectivity.
	//To perform database operation by using jdbc we need to follow following steps-
	//1-import the package
	//2-load and register the driver
	//3- Establish the connection
	//4- create the statement
	//5- execute the statement
	//6-process the reslt
	//7- close the connection
	//set.next();
	
	//System.out.println(set.getInt(1));
	//System.out.println(set.getString(2));
	//System.out.println(set.getString(3));
//	System.out.println(set.getString(4));
	
	
    while(set.next()) {
	
	System.out.println(set.getInt(1)+"/t");
	System.out.println(set.getString(2));
	System.out.println(set.getString(3));
	System.out.println(set.getString(4));
	//System.out.println(set.getNString(0));
	
    }
	
	
	System.out.println(set);
	connection.close();
	//System.out.println(set.absolute(1));
	//System.out.println(execute);
	//System.out.println("connected");
}
catch(ClassNotFoundException | SQLException e  ) {
	e.printStackTrace();
}
	}

}
