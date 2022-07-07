
public class Main {

	public static void main(String[] args) {
		Student student=new Student(13,"Sanjana","C2TC");
		Student student1=new Student();
		student.display();
		student1.rollno=123;
		student1.batch_name="B18";
		System.out.println(student1.batch_name);
		System.out.println(student.batch_name);
		//System.out.println(this.rollno);
	}

}
