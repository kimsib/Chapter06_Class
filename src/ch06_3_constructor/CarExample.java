package ch06_3_constructor;

class Car {
	// �ʵ�
	String company;
	String model;
	String color;
	int maxSpeed;

	// ������
	public Car() {

	}

	Car(String model) {
		// this.color = "�Ķ�"; ��
		this(model, "����", 250);
	}

	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	int add(int x) {

		return 0;
	}

	int add(int x, int y) {
	
		return 0;
	}
	
}

public class CarExample {
	public static void main(String[] args) {

	}
}
