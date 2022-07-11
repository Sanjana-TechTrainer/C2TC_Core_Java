package tnsif.c2tc.b6.Services;

import java.util.List;

import tnsif.c2tc.b6.entities.Student;

public interface StudentService {
	public Student GetStudent(int uid)throws Exception;

	public List<Student> GetStudents()throws Exception;

	public boolean DeleteStudent(int nextInt)throws Exception;

	public boolean AddStudent(Student student)throws Exception;

	public Student UpdateStudent(Student student)throws Exception;

}
