package ch06_4_method;

public class CalculatorExample__ {
	public static void main(String[] args) {
		
	
	Calculator__ myCalc = new Calculator__();
	myCalc.powerOn();
	
	int result1 = myCalc.plus(5, 6);
	System.out.println("result1: " + result1);
	
	byte x = 10;
	byte y = 4;
	double result2 = myCalc.divide(x,  y);
	System.out.println("result2: " + result2);
	
	myCalc.powerOff();
	
	
	
	
	
	
	}
}
