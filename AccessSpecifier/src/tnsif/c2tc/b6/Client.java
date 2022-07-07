package tnsif.c2tc.b6;

import tnsif.c2tc.b6.entities.C2TC;
import tnsif.c2tc.b6.entities.Student;

public class Client {
	public static void main(String[] args) {
		Student  student =new Student();
		C2TC c=new C2TC();
		student.setUid(12);
		student.setName("Mubrak");
		c.setTechtrainer("sanjana");
		c.setSstrainer("Indrani");
		
		student.display();
		
		c.display(student);
		
	
	}

}
