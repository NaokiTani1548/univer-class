
public class Account708 {
	String name;
	String number;
	long balance;

	Account708(String name, String number, long balance) {
		this.name = name;
		this.number = number;
		this.balance = balance;
	}

	void withdraw(int mbank) {
		if (balance >= mbank) {
			balance -= mbank;
		} else {
			System.out.println("残高が不足しています");
		}
	}

	void deposit(int pbank) {
		balance += pbank;
	}
}

class AccountBank {
	public static void main(String[] args) {

		Account708 tanaka = new Account708("足立幸一", "123456", 1000);

		tanaka.deposit(500);
	

		System.out.println("口座");
		System.out.println("口座名義:" + tanaka.name);
		System.out.println("口座番号:" + tanaka.number);
		System.out.println("預金残高:" + tanaka.balance);
	}

}
