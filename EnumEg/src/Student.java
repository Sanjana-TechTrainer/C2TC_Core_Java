
public class Student {
	int rollno;
	String name;
	Branch branch;
	public Student(int rollno, String name, Branch branch) {
		this.rollno = rollno;
		this.name = name;
		this.branch = branch;
	}
	public Student()
	{
		System.out.println("in constructor");
	}
	
	
}
