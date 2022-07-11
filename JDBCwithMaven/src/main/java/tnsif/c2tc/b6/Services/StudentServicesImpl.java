package tnsif.c2tc.b6.Services;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import tnsif.c2tc.b6.Repo.StudentRepo;
import tnsif.c2tc.b6.entities.Student;

public class StudentServicesImpl implements StudentService {

	public Student GetStudent(int uid) throws Exception {
		Student student=new Student();
		StudentRepo repo=new StudentRepo();
		String query="SELECT * FROM details WHERE uid=" + uid;
		ResultSet rs=repo.ReterieveQuery(query);
		rs.next();
		student.setUid(rs.getInt(1));
		student.setName(rs.getString(2));
		return student;
	}
	public List<Student> GetStudents() throws Exception
	{
		List<Student> students =new ArrayList<Student>();
		StudentRepo repo=new StudentRepo();
		String query="SELECT * FROM details";
		ResultSet rs=repo.ReterieveQuery(query);
		while(rs.next())
		{
			Student student=new Student();
			student.setUid(rs.getInt(1));
			student.setName(rs.getString(2));
			students.add(student);
		}
		return students;
	}

	
	public boolean DeleteStudent(int uid) throws Exception {
		StudentRepo repo =new StudentRepo();
		String query="DELETE FROM details WHERE uid = " + uid;
		int count =repo.DeleteQuery(query);
		if(count==1)
			return true;
		else
			return false;
	}
	public boolean AddStudent(Student student) throws Exception {
		String query="INSERT INTO details VALUES (?,?)";
		StudentRepo repo=new StudentRepo();
		int count =repo.AddQuery(query, student);
		if(count==1)
			return true;
		else
			return false;
		
	}
	
	public Student UpdateStudent(Student student) throws Exception {
		String query="UPDATE details SET name = ? WHERE (uid = ?)";
		StudentRepo repo=new StudentRepo();
		int count =repo.UpdateQuery(query, student);
		if(count==1) 
		{
			Student s=GetStudent(student.getUid());
			return s;
		}
			
		else
			return null;
		
	}
	
}
