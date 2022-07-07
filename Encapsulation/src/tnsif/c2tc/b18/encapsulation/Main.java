package tnsif.c2tc.b18.encapsulation;


import tnsif.c2tc.b18.encapsulation.entities.*;
//import tnsif.c2tc.b18.encapsulation.entities.Student;

public class Main {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		//upcasting, lazy initialization and late binding
		C2TC c=new Student(2101721, "Nikitha");
		Student s=(Student)c;//downcasting
		//s.show();
		s.display();
		s.setName("Sushma");
		//s.display();
		System.out.println(s);
		

	}

}
