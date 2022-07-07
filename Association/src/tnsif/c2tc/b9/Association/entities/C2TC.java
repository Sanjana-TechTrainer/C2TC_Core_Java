package tnsif.c2tc.b9.Association.entities;

public class C2TC {
	String trainer_name;
	

	@Override
	public String toString() {
		return "C2TC [trainer_name=" + trainer_name + "]";
	}


	public C2TC(String trainer_name) {
		super();
		this.trainer_name = trainer_name;
	}
	

}
