package ch06_4_method;

public class Calculator {

	public void pwerOn() {
		
		System.out.println("������ �մϴ�.");
	}

	public int plus(int i, int j) {
		
		return i + j;
	}
		public void powerOff() {
			System.out.println("������ ���ϴ�.");
		}
		
		
		
		
		
		
		public double divide(int i, int j ) {
			if(j == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			return (double) i / j;
		}
}
