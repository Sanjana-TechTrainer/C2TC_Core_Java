package tnsif.c2tc.b9.Association.entities;

public class Main {

	public static void main(String[] args) {
		C2TC c=new C2TC("Sanjana");
		APSCE a=new APSCE("Vidya", "8 Sem CSE",c);//Aggregation
		a.sessions();
		System.out.println(c);
	}

}
