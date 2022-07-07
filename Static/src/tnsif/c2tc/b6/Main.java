package tnsif.c2tc.b6;

import tnsif.c2tc.b6.entities.Student;

public class Main {

	public static void main(String[] args) {
		int a=89;
		Student s=new Student();
		s.uid=2000504;
		s.name= "Megha A";
		s.collegename="VVIT";
		Student s1=new Student();
		s1.uid=2000512;
		s1.name= "Indu B";
		Student.collegename="Vijaya Vittala Institute of Tech";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(a);

	}

}
