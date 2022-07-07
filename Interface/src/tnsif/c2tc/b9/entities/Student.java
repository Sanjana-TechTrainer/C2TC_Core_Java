package tnsif.c2tc.b9.entities;

public class Student implements C2TC,College{

	@Override
	public void onlinesession() {
		System.out.println("Session happens in zoom");
		
	}

	@Override
	public void offlinesession() {
		System.out.println("Session happens in college");
		
	}

}
