package tnsif.c2tc.b6;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

import tnsif.c2tc.b6.Services.StudentServices;
import tnsif.c2tc.b6.entities.Student;

public class Main {
	public static void main(String[] args) throws Exception {
		StudentServices service=new StudentServices();
		Student student=new Student();
		Scanner sc=new Scanner(System.in);
		
		// Retrieve a particular student
		try
		{
			student.setUid(sc.nextInt());
			Student student1= service.GetStudent(student.getUid());
			System.out.println(student1);
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
		student.setUid(sc.nextInt());
		boolean success = service.DeleteStudent(student.getUid());
		if(success)
			System.out.println("Student was deleted sucessfully");
		else
			System.out.println("Details not found");
		
		// Insert a student
		
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