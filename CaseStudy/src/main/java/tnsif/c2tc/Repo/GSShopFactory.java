package tnsif.c2tc.Repo;

import tnsif.c2tc.Services.*;


public class GSShopFactory implements ShopFactory {


	public PrimeAcc getNewPrimeAccount(int accno, String accname, float charges) {
		PrimeAcc pa= new GSPrimeAcc(accno, accname, charges);
		return pa;
	}

	public NormalAcc getNewNormalAccount(int accno, String accname, float charges) {
		NormalAcc na= new GSNormalAcc(accno, accname, charges);
		return na;
	}
	

}
