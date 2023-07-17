package dynamicCRUDOperation;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
public class DatabaseOperatr2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("enter tthe query");
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		String query=reader.readLine();
try {
	

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/m10_e3";
		FileInputStream stream= new FileInputStream("mydbinfo.properties");
		Properties pro= new Properties();
		pro.load(stream);
		Connection con = DriverManager.getConnection(url,pro);
		Statement stm= con.createStatement();
		boolean res= stm.execute(query);
		if(res) {
			ResultSet set=stm.getResultSet();
			while(set.next()) {
				System.out.println(set.getInt(1));
				System.out.println(set.getString(2));
				System.out.println(set.getString("email"));
				System.out.println(set.getString(4));
			}
		}
		else {
			System.out.println("table updated succesfully");
		}
			con.close();
		}

catch(IOException | ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}



}

 {
	
	
}
	

}
