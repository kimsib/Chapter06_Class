package ch06_5_instance_static;

public class Car_ {
	int speed;
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Car_ myCar = new Car_();
		myCar.speed = 60;
		myCar.run();
	}
}
