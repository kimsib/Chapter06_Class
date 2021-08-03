package ch06_ex_bank;



public class BankAccountPOP {

	static int balance = 0;

	public static void main(String[] args) {

		int balance = 0;

		deposit(10000);

		withdraw(3000);

		checkBalance();

		withdraw(1000);
		deposit(30000);
		
		checkBalance();
	}

	private static void checkBalance() {
		System.out.println("ÇöÀç ÀÜ°í : " + balance);
	}

	private static void withdraw(int withdrawAmount) {
		balance = balance + withdrawAmount;
	}

	private static void deposit(int depositAmount) {
		balance = balance + depositAmount;

	}
}
