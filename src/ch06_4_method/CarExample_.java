package ch06_4_method;

public class CarExample_ {
	public static void main(String[] args) {

		Car_ myCar = new Car_();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("���� �ӵ�: " + speed + "km/h");

	}

}
