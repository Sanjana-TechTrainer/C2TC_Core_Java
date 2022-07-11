/*
 * 29th and 30th June
 * JDBC with structure and Maven
 *
 */
package tnsif.c2tc.b6;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

import tnsif.c2tc.b6.Services.StudentService;
import tnsif.c2tc.b6.Services.StudentServicesImpl;
import tnsif.c2tc.b6.entities.Student;

public class Main {
	public static void main(String[] args) throws Exception {
		StudentService service=new StudentServicesImpl();
		Scanner sc=new Scanner(System.in);
		
		// Retrieve a particular student
		try
		{	
			Student student= service.GetStudent(sc.nextInt());
			System.out.println(student);
		}
		catch (Exception e) {
			System.out.println("Details not found");
		}
		
		//Retrieve all students
		
		List<Student>students= service.GetStudents();
		System.out.println(students);
		for (Student s: students)
			System.out.println(s);
		
		// Delete a student

		boolean success = service.DeleteStudent(sc.nextInt());
		if(success)
			System.out.println("Student was deleted sucessfully");
		else
			System.out.println("Details not found");
		
		// Insert a student
		
		Student student=new Student();
		student.setUid(sc.nextInt());
		student.setName(sc.next());
		if(service.AddStudent(student))
			System.out.println("Added Successfully");
		else
			System.out.println("There was a problem in creation");
		
		// Update a student
		
		student.setUid(sc.nextInt());
		sc.nextLine();
		student.setName(sc.nextLine());
		Student s= service.UpdateStudent(student);
		if (s!=null)
			System.out.println(s);
		else
			System.out.println("Student not found");

	}
}