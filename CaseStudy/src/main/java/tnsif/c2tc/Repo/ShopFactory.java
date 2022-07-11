package tnsif.c2tc.Repo;

import tnsif.c2tc.Services.NormalAcc;
import tnsif.c2tc.Services.PrimeAcc;

public interface ShopFactory {
	public PrimeAcc getNewPrimeAccount(int accno, String accname, float charges);
	public NormalAcc getNewNormalAccount(int accno, String accname, float charges);

}
