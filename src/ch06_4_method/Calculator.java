package ch06_4_method;

public class Calculator {

	public void pwerOn() {

		System.out.println("전원을 켭니다.");
	}

	public int plus(int i, int j) {

		return i + j;
	}

	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	public double divide(int i, int j) {
		if (j == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		return (double) i / j;
	}
}
