
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
			System.out.println("�c�����s�����Ă��܂�");
		}
	}

	void deposit(int pbank) {
		balance += pbank;
	}
}

class AccountBank {
	public static void main(String[] args) {

		Account708 tanaka = new Account708("�����K��", "123456", 1000);

		tanaka.deposit(500);
	

		System.out.println("����");
		System.out.println("�������`:" + tanaka.name);
		System.out.println("�����ԍ�:" + tanaka.number);
		System.out.println("�a���c��:" + tanaka.balance);
	}

}
