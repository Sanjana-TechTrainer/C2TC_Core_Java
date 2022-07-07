package tnsif.c2tc.b9.Association.entities;

public class APSCE {
	String teacher_name;
	String class_name;
	C2TC c;
	/*public APSCE(String teacher_name, String class_name) {
		super();
		this.teacher_name = teacher_name;
		this.class_name = class_name;
		c=new C2TC("Sanjana");// Composition
		
	}*/
	
	void sessions()
	{
		System.out.println("Sessions are going on by "+c.trainer_name);
	}
	public APSCE(String teacher_name, String class_name, C2TC c) {
		super();
		this.teacher_name = teacher_name;
		this.class_name = class_name;
		this.c = c;
	}
	

}
