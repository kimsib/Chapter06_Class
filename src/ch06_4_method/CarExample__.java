package ch06_4_method;

public class CarExample__ {
	public static void main(String[] args) {
		Car__ myCar = new Car__();

		myCar.setGas(5); // Car�� setGas()�޼ҵ� ȣ��

		boolean gasState = myCar.isLeftGas(); // Car�� isLeftGas() �޼ҵ� ȣ��
		if (gasState) {
			System.out.println("����մϴ�.");
			myCar.run(); // Car�� run() �޼ҵ� ȣ��

		}

		if (myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}

	}

}
