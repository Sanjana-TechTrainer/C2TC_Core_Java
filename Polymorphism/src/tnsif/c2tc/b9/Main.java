package tnsif.c2tc.b9;
//import java.util.Scanner;
//import java.util.*;
import tnsif.c2tc.b9.entities.C2TC;
import tnsif.c2tc.b9.entities.Student;

public class Main {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		java.util.Scanner sc=
				new java.util.Scanner(System.in);//fully qualified name
		C2TC s=new Student();//upcasting or late binding
		Student s1=(Student) s;//downcasting
		s1.setRollno(sc.nextInt());
		System.out.println(s1.getRollno());
		s.session();
		

	}

}
