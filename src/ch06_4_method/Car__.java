package ch06_4_method;

public class Car__ {

	// �ʵ�
	int gas;
	// ������
	// �޼ҵ�

	void setGas(int gas) {
		this.gas = gas;

	}
	// ���ϰ��� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas�ʵ尪�� ����

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false; // false�� ����
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true; // true�� ����
	}
//���� ���� blooean�� �޼ҵ�� gas�ʵ尪�� 0�̸� false��, 0�� �ƴϸ� true�� ����

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�.(gas�ܷ�:" + gas + ")");
			} // �޼ҵ� ���� ����
		}
	}

}
