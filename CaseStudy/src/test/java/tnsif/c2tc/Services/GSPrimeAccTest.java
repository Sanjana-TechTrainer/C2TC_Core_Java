package tnsif.c2tc.Services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GSPrimeAccTest {

	@Test
	void test() {
		GSPrimeAcc pa=Mockito.mock(GSPrimeAcc.class);
		pa.bookProducts(0);
		verify(pa,times(1)).bookProducts(0);
	}

}
