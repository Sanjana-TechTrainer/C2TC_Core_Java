package tnsif.c2tc;

import tnsif.c2tc.Repo.GSShopFactory;
import tnsif.c2tc.Repo.ShopFactory;
import tnsif.c2tc.Services.GSNormalAcc;
import tnsif.c2tc.Services.GSPrimeAcc;
import tnsif.c2tc.Services.NormalAcc;
import tnsif.c2tc.Services.PrimeAcc;

public class Client {

	public static void main(String[] args) {
		ShopFactory sf= new GSShopFactory();
		PrimeAcc pa=sf.getNewPrimeAccount(123, "Abhijeet", 1000);
		pa.bookProducts(500);
		NormalAcc na =sf.getNewNormalAccount(1234, "Anil", 0);
		na.bookProducts(500);

	}

}
