package tnsif.c2tc.Repo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockitoSession;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import tnsif.c2tc.Services.GSPrimeAcc;
import tnsif.c2tc.Services.NormalAcc;
import tnsif.c2tc.Services.PrimeAcc;

@RunWith(JUnitPlatform.class)
class GSShopFactoryTest {
	

	//To test getNewPrimeAccount
	@Test
	void test1() {
		GSShopFactory sf=new GSShopFactory();
		PrimeAcc pa=sf.getNewPrimeAccount(0, null, 0);
		//PrimeAcc pamock= Mockito.mock(GSPrimeAcc.class);
		assertEquals(pa.getClass(), sf.getNewPrimeAccount(0, null, 0).getClass(), "Success");
	}
	
	//To test getNewNormalAccount
	@Test
	void test2() {
		GSShopFactory sf=new GSShopFactory();
		NormalAcc na=sf.getNewNormalAccount(0, null, 0);
		assertEquals(na.getClass(), sf.getNewNormalAccount(0, null, 0).getClass(), "Success");
	}

}
