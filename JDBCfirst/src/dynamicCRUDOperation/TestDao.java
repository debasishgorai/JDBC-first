package dynamicCRUDOperation;

import java.util.List;

public class TestDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s= new Student(17,"ghhulykumar","ff8f99@gmail.com","physics");
StudentDao dao= new StudentDao();
//System.out.println(dao.saveStudent(s));
//System.out.println(dao.getAllStudent());
List<Student>list=dao.getAllStudent();
if(list!=null) {
	list.forEach(System.out::println);
	
}
else {
	System.out.println("no data present in DB");
}

	}

}
//Dynamic Database:-it is atype of database queryin jdbc where the values are replaced byplaceholders '?'.
//Prepared Statement:-  it is an interface from jav.sql package which extends statement interface & are used for executing dynamic query.
//A non-static method from connection interface called prepared Statement, which accepts String query is an argument and return and Object of implementing class of assigned with the database query provided as an argument to prepared Statement.Argument to prepared Statement methods.
//As prepared statement can execute dynamic query.we need to assign objectpd ps.by execute.To assign data to the placeholders we need to use set methods from ps interface.
// set(xxx(int position,xxx value); :- it is a on-static method from ps interface, which is used to assign the data to ps in the dynamic query.Set followed by the datatype of the data to be assigned to the place holder except two argument----1>- integer position of placeholder
//2>- will be the data to be assigned to tthe placeholder in specify position/.
// String query="insert into student values(?,?,?,?)";
//PreparedStatement ps= con.preparedstatement(query);
//ps.setInt(1,101);
//ps.setString(2,"ram");
//ps.setString(3,"frt");