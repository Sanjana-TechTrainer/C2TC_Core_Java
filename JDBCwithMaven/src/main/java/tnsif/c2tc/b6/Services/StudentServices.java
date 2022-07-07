package tnsif.c2tc.b6.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tnsif.c2tc.b6.entities.Student;

public class StudentServices {

	public Student GetStudent(int uid) throws Exception {
		Student student=new Student();
		Statement statement=createstatement();
		String query="SELECT * FROM details WHERE uid=" + uid;
		ResultSet rs=statement.executeQuery(query);
		rs.next();
		student.setUid(rs.getInt(1));
		student.setName(rs.getString(2));
		return student;
	}
	public List<Student> GetStudents() throws Exception
	{
		List<Student> students =new ArrayList<Student>();
		Statement statement=createstatement();
		String query="SELECT * FROM details";
		ResultSet rs=statement.executeQuery(query);
		while(rs.next())
		{
			Student student=new Student();
			student.setUid(rs.getInt(1));
			student.setName(rs.getString(2));
			students.add(student);
		}
		return students;
	}

	private Statement createstatement() throws Exception {
		String url="jdbc:mysql://localhost:3306/b1-6";
		String user="root";
		String pwd="01022021";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,pwd);
		Statement statement=connection.createStatement();
		return statement;
	}
	public boolean DeleteStudent(int uid) throws Exception {
		Student student=new Student();
		Statement statement=createstatement();
		String query="DELETE FROM details WHERE uid = " + uid;
		int count =statement.executeUpdate(query);
		if(count==1)
			return true;
		else
			return false;
	}
	public Boolean AddStudent(Student student) throws Exception {
		String query="INSERT INTO details VALUES (?,?)";
		PreparedStatement statement=createPrepareStatement(query);
		statement.setInt(1, student.getUid());
		statement.setString(2, student.getName());
		int count =statement.executeUpdate();
		if(count==1)
			return true;
		else
			return false;
		
	}
	private PreparedStatement createPrepareStatement(String query) throws Exception {
		String url="jdbc:mysql://localhost:3306/b1-6";
		String user="root";
		String pwd="01022021";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,pwd);
		PreparedStatement statement=connection.prepareStatement(query);
		return statement;
	}
	public Student UpdateStudent(Student student) throws Exception {
		String query="UPDATE details SET name = ? WHERE (uid = ?)";
		PreparedStatement statement=createPrepareStatement(query);
		statement.setInt(2, student.getUid());
		statement.setString(1, student.getName());
		int count =statement.executeUpdate();
		if(count==1) 
		{
			Student s=GetStudent(student.getUid());
			return s;
		}
			
		else
			return null;
		
	}
	
}
