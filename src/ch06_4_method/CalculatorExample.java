package ch06_4_method;

class util {
	public void calcExec() {

		Calculator myCalc = new Calculator();

		// ���� �ѱ�
		myCalc.pwerOn();

		// ����ϱ�
		int var1 = myCalc.plus(8, 8);
		System.out.println("var1:" + var1);

		double var2 = myCalc.divide(4, 8);
		System.out.println("var2:" + var2);

		byte x = 10;
		byte y = 4;
		double var3 = myCalc.divide(x, y);
		System.out.println("var3:" + var3);

		// ���� ����
		myCalc.powerOff();
	}
}

public class CalculatorExample {
	public static void main(String[] args) {

		util util = new util();
		util.calcExec();

	}
}