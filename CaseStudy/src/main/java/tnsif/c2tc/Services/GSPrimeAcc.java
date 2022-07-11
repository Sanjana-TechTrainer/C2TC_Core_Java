package tnsif.c2tc.Services;

import tnsif.c2tc.entities.ShopAcc;

public class GSPrimeAcc extends ShopAcc implements PrimeAcc  {
	
	public GSPrimeAcc(int accno,String accname, float charges)
	{
		setAccno(accno);
		setAccname(accname);
		setCharges(charges);
	}

	public boolean isIsprime() {
		return isprime;
	}

	public void bookProducts(float charges) {
		System.out.println("You have purchased of charges "+charges);
		
	}
	

}
