package dynamicCRUDOperation;

import java.io.FileInputStream;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class StudentDao {
	
	
	private Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/m10_e3";
			FileInputStream stream= new FileInputStream("mydbinfo.properties");
			Properties pro= new Properties();
			pro.load(stream);
			 con = DriverManager.getConnection(url,pro);
			
		}

catch(IOException | ClassNotFoundException | SQLException e) {
	e.printStackTrace();
	}
		return con;
		
	}

	public String saveStudent(Student student) {
		// TODO Auto-generated method stub



	//Class.forName("com.mysql.cj.jdbc.Driver");
	//String url="jdbc:mysql://localhost:3306/m10_e3";
	//FileInputStream stream= new FileInputStream("mydbinfo.properties");
//	Properties pro= new Properties();
//	pro.load(stream);

		Connection con = getConnection();
		String query="update into student SET name=?,email=?,course=? WHERE id=?";
		PreparedStatement ps;
		try {
	 ps= con.prepareStatement(query);
		ps.setInt(4, student.getId());
		ps.setString(1, student.getName());
		ps.setString(2, student.getEmail());
		ps.setString(3, student.getCourse());
		int res= ps.executeUpdate();
		
		con.close();
		return res+"row of data inserted";
	}

catch( SQLException e) {
	e.printStackTrace();
	}
return null;
	}
	public Student getStudentById(int id) {
		String query="SELECT * FROM student WHERE id=?";
		Student student=null;
		Connection connection=getConnection();
		List<Student>list= new ArrayList();
		try {
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet set= ps.executeQuery();
			if(set.next()) {
				list= new ArrayList<>();
				while(set.next()) {
				student= new Student();
				student.setId(set.getInt(1));
				student.setName(set.getString(2));
				student.setEmail(set.getString(3));
				student.setCourse(set.getString(4));
				
			}}
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return student;
	}
	public String deleteStudentById(int id) {
		return null;
}
	public List<Student>getAllStudent(){
		
		Connection con=getConnection();
		String query="select * from student";
		List<Student>list=null;
		PreparedStatement ps;
		try {
			ps=con.prepareStatement(query);
			ResultSet set= ps.executeQuery();
			if(set.isBeforeFirst()) {
				
				list = new ArrayList<>();
				while(set.next()) {
				Student	student= new Student();
					student.setId(set.getInt(1));
					student.setName(set.getString(2));
					student.setEmail(set.getString(3));
					student.setCourse(set.getString(4));
					list.add(student);
					
					
				}}
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return list;
		}	
				}
			