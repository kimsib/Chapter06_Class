package ch06_4_method;

public class CarExample {
	public static void main(String[] args) throws InterruptedException {

		Car myCar = new Car();

		myCar.setGas(10);

		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("����մϴ�");
			myCar.run();
		}

		if (myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");

		} else {
			System.out.println("gas�� �����ϼ���.");
		}

	}
}
