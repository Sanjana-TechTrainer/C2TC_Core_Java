
public class Main {

	public static void main(String[] args) {
		Student s;//declaration
		Student s1=new Student();
		s=new Student(13,"Indu B",Branch.CSE);
		System.out.println(s.name);
		System.out.println(s.rollno);
		System.out.println(s.branch);
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		System.out.println(s1.branch);


	}

}
