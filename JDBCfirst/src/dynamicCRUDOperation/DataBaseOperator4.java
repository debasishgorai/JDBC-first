package dynamicCRUDOperation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class DataBaseOperator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/m10_e3";
			FileInputStream stream= new FileInputStream("mydbinfo.properties");
			Properties pro= new Properties();
			pro.load(stream);
			Connection con = DriverManager.getConnection(url,pro);
			System.out.println("enter the query");
			BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
			String query=reader.readLine();
			Statement stm= con.createStatement();
			boolean res= stm.execute(query);
			if(res) {
				ResultSet set=stm.executeQuery(query);
				ResultSetMetaData metaData= (ResultSetMetaData) set.getMetaData();
				int count= metaData.getColumnCount();
				
				while(set.next()) {
					for(int i=1;i<=count;i++) {
						System.out.println(metaData.getColumnName(i)+"of student is="+set.getObject(i));
					}
					System.out.println("............................................");
					
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
