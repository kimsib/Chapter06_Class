package ch06_4_method;

public class ComputerExample {
	public static void main(String[] args) {

		Computer myCom = new Computer();
		myCom.intList={1,2};

		int[] Values1 = { 1, 2, 3 };
		// 100¹øÁö
		int result1 = myCom.sum1(Values1);
		System.out.println("myCom.sum(int[]): " + result1);

		int result2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("mycom.sum(new int []{}) :" + result2);

		int result3 = myCom.sum2(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		System.out.println("mycom.sum2(new...values []{}) :" + result3);

	}
}
