package tnsif.c2tc.b6.Repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import tnsif.c2tc.b6.entities.Student;

public class StudentRepo {
	private Connection createConnection() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/b1-6";
		String user="root";
		String pwd="01022021";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,pwd);
		return connection;
	}
	private Statement createstatement() throws Exception {
		Connection connection=createConnection();
		Statement statement=connection.createStatement();
		return statement;
	}
	private PreparedStatement createPrepareStatement(String query) throws Exception {
		Connection connection=createConnection();
		PreparedStatement statement=connection.prepareStatement(query);
		return statement;
	}
	public ResultSet ReterieveQuery(String query) throws Exception {
		Statement statement=createstatement();
		ResultSet rs=statement.executeQuery(query);
		return rs;
		
	}
		
	public int DeleteQuery(String query) throws Exception {
		Statement statement=createstatement();
		int count =statement.executeUpdate(query);
		return count;
	}
	public int UpdateQuery(String query, Student student) throws Exception {
		PreparedStatement statement=createPrepareStatement(query);
		statement.setInt(2, student.getUid());
		statement.setString(1, student.getName());
		int count =statement.executeUpdate();
		return count;
	}
	public int AddQuery(String query, Student student) throws Exception {
		PreparedStatement statement=createPrepareStatement(query);
		statement.setInt(1, student.getUid());
		statement.setString(2, student.getName());
		int count =statement.executeUpdate();
		return count;
	}
	

}
