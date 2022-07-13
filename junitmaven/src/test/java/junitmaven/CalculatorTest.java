package junitmaven;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
@RunWith(JUnitPlatform.class)
class CalculatorTest {

	@Test
	void test() {
		/*CalculatorService service= new CalculatorService() {
			
		public int add(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
		};*/
		CalculatorService service=Mockito.mock(CalculatorService.class);
		Calculator c= new Calculator(service);
		//when(service.add(2, 3)).thenReturn(5);
		assertEquals(10, c.perform(2,3));
		verify(service);
	}

}
