package tnsif.c2tc.b6.entities;

public class Student {
	private int uid;
	private String name;
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display()
	{
		System.out.println(uid);
		System.out.println(name);
	}
	

}
