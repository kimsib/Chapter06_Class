package ch06_3_constructor;

public class Car1Example {
	public static void main(String[] args) {
		Car1 cara = new Car1(); // ������ ����
		System.out.println("cara.company: " + cara.company);
		System.out.println();

		Car1 carb = new Car1("�ڰ���"); // ������ ����
		System.out.println("carb.company: " + carb.company);
		System.out.println("carb.model : " + carb.model);
		System.out.println();

		Car1 carc = new Car1("�ڰ���", "����"); // ������ ����
		System.out.println("carc.company: " + carc.company);
		System.out.println("carc.motel: " + carc.model);

		Car1 card = new Car1("�ý�", "����", 200);
		System.out.println("card.company:" + card.company);
		System.out.println("card.model: " + card.model);
		System.out.println("card.color : " + card.color);
		System.out.println("card.maxSpeed: " + card.maxSpeed);

	}
}
