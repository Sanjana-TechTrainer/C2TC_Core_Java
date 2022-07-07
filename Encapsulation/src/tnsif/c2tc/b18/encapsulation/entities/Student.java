package tnsif.c2tc.b18.encapsulation.entities;


public class Student extends C2TC {
	private int UID;
	private String name;
	public Student(int uID, String name) {
		super("Sanjana", "Damini");
		UID = uID;
		this.name = name;
	}
	
	public int getUID() {
		return UID;
	}

	public void setUID(int uID) {
		UID = uID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void display()
	{
		//show();
		System.out.println(UID +" : "+ name);
	}

	@Override
	public String toString() {
		return "Student [UID=" + UID + ", name=" + name + "]";
	}
	

}
