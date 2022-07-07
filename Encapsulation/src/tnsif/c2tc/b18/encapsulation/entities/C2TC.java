package tnsif.c2tc.b18.encapsulation.entities;


public class C2TC {
	private String TechTrainer;
	private String SSTrainer;
	
	public String getTechTrainer() {
		return TechTrainer;
	}
	public void setTechTrainer(String techTrainer) {
		TechTrainer = techTrainer;
	}
	public String getSSTrainer() {
		return SSTrainer;
	}
	public void setSSTrainer(String sSTrainer) {
		SSTrainer = sSTrainer;
	}
	public C2TC(String techTrainer, String sSTrainer) {
		super();
		TechTrainer = techTrainer;
		SSTrainer = sSTrainer;
	}
	public void display()
	//void show()
	{
	
		System.out.println("The class is conducted by "+
							TechTrainer+ " and "+
							SSTrainer);
	}
	@Override
	public String toString() {
		return "C2TC [TechTrainer=" + TechTrainer + ", SSTrainer=" + SSTrainer + "]";
	}
	

}
