package tnsif.c2tc.b6.entities;

public class C2TC {
	private String techtrainer;
	private String sstrainer;
	
	public String getTechtrainer() {
		return techtrainer;
	}

	public void setTechtrainer(String techtrainer) {
		this.techtrainer = techtrainer;
	}

	public String getSstrainer() {
		return sstrainer;
	}

	public void setSstrainer(String sstrainer) {
		this.sstrainer = sstrainer;
	}

	public void display(Student student)
	{
		System.out.println(student.getUid());
		System.out.println(techtrainer);
		System.out.println(sstrainer);
	}

}
