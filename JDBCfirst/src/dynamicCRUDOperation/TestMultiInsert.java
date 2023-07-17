package dynamicCRUDOperation;

import java.sql.Connection;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class TestMultiInsert {

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
	Connection connection=DriverManager.getConnection(url, user, pass);
	Statement statement=connection.createStatement();
	
	


	String query="INSERT INTO student values(85,'debasish','debasish@gmail','geography')";


	String query2="INSERT INTO student values(84,'vijay','thalapathy@gmail','geography')";


	String query3="INSERT INTO student values(83,'salman','salman@gmaill','geography')";


	String query4="INSERT INTO student values(82,'dhoni','dhoni@gmaill','geography')";
	
	String update="UPDATE student set name='rahullll' where id=3";
	String delete="DELETE FROM student where id=3";
	
	statement.addBatch(query);
	statement.addBatch(query2);
	statement.addBatch(query3);
	statement.addBatch(query4);
	statement.addBatch(update);
	statement.addBatch(delete);
	//statement.executeBatch();
	int[]batch= statement.executeBatch();
	for(Integer e: batch) {
		System.out.println(e);
	}
	System.out.println(batch.length);
	
	
	
	
	
	
	
	
	connection.close();
	}
catch(ClassNotFoundException | SQLException e  ) {
	e.printStackTrace();
}
	}

	}
