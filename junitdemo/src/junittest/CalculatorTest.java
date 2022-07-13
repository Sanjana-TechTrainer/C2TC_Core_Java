package junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import junitdemo.Calculator;

class CalculatorTest {
	Calculator calculator;
	@BeforeEach
	public void setup()
	{
		calculator=new Calculator();
	}

	@Test
	@RepeatedTest(value = 4, name = RepeatedTest.TOTAL_REPETITIONS_PLACEHOLDER)
	void testadd() {
		
		assertEquals(5, calculator.add(2, 3));
	}
	@RepeatedTest(value=3,name="{displayName} - repetition-{currentRepetition}/{totalRepetitions}")
	@Test
	void testarea()
	{
		//Calculator calculator=new Calculator();
		assertEquals(314.1592712402344, calculator.area(10));
	}
	@Test
	void test_assumption()
	{
		//Assumptions.assumeTrue(true);
		//if(false)
		assertFalse(true);
		System.out.print("HIII");
	}
	@ParameterizedTest(name = "{index}- Run test with args={0}")
	@ValueSource(ints = { 1,3,6,7})
	void ptest1(int args)
	{
		System.out.print(args);
	}
	enum fruits{
		apple,banana,orange;
	}
	@ParameterizedTest(name = "{index}- Run test with args={0}")
	@EnumSource(fruits.class)
	void ptest2(fruits args)
	{
		System.out.print(args);
	}
	private static String[] fruits()
	{
		return new String[] {"apple","banana","orange"};
	}
	@ParameterizedTest(name = "{index}- Run test with args={0}")
	@MethodSource("fruits")
	void ptest3(String args)
	{
		System.out.print(args);
	}
	@ParameterizedTest(name = "{index}- Run test with args={0}")
	@CsvSource({"java, programing lang",
				"junit,unit testing"})
	void ptest4(String args, String des)
	{
		System.out.print(args+"-"+des);
	}
}
