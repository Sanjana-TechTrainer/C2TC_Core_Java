package tnsif.c2tc.b9.entities;
public class Student extends C2TC {
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void session()
	{
		System.out.println("Sessions are going on for B1-9");
	}

}
