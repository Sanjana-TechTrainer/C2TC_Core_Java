package tnsif.c2tc.Services;

import tnsif.c2tc.entities.ShopAcc;

public class GSNormalAcc extends ShopAcc implements NormalAcc {

	public GSNormalAcc(int accno,String accname, float charges)
	{
		setAccno(accno);
		setAccname(accname);
		setCharges(charges);
	}
	public void bookProducts(float charges) {
		System.out.println("You have purchased the product with charges "
							+charges
							+" along with delivery charges "
							+deliverycharges);
		
	}



	
	
}
	