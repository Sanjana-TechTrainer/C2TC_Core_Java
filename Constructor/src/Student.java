
public class Student {
	int rollno;
	String name="Sanjana";
	static String batch_name;
	Branch br=Branch.CSE;
	public Student() {
	}
	public Student(int rollno, String name, String batch_name) {
		this.rollno = rollno;
		this.name = name;
		this.batch_name = batch_name;
	}
	void display()
	{
		System.out.println(this.rollno + " "+ name+ " " +batch_name);
		System.out.println(this.br);
	}

}
