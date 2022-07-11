package tnsif.c2tc.Services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
@RunWith(JUnitPlatform.class)
class GSNormalAccTest {

	@Test
	void test() {
		GSNormalAcc na=Mockito.mock(GSNormalAcc.class);
		na.bookProducts(0);
		verify(na,times(1)).bookProducts(0);
	}

}
