package ch06_4_method;

public class Car {
	// �ʵ�
	int gas;

	// ������

	// �޼ҵ�
	// �������� �޼ҵ�
	void setGas(int gas) {
		this.gas = gas;

	}

	// �����ܷ� ����
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;

	}

	/// ����
	void run() throws InterruptedException {
		while (true) {
			if (gas > 0) {
				System.out.printf("������~~~[gas: %d]\n", gas);
				gas--;
				Thread.sleep(500);
			} else {
				System.out.printf("����!!![gas: %d]\n, gas");
				return; // run()�޼ҵ� ��������
			}
		}
	}
}
