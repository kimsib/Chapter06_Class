package ch06_3_constructor;

public class Ccar {

	//�ʵ�
	
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Ccar() {
		
	}
	
	Ccar(String model) {
		this(model, "����, 250");
		
	}
	
	Ccar(String model, String color) {
		this(model, color, 250);
	}
	
	Ccar (String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
