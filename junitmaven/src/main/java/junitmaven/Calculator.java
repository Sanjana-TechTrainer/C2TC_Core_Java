package junitmaven;

public class Calculator {
	CalculatorService service;
	public Calculator(CalculatorService service) {
		this.service=service;
	}
	int perform(int a, int b)
	{
		//return service.add(a,b)*a;
		return (a+b)*a;
	}

}
