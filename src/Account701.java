public class Account701 {
	String name;
	String number;
	long balance;

	Account701(String name, String number, long balance) {
		this.name = name;
		this.number = number;
		this.balance = balance;
	}

	public void setName(String x) {
		name = x;

	}
}
class AccountTester {
	public static void main(String[] args) {

		Account701 tanaka = new Account701("�����K��", "123456", 1000);

		tanaka.setName("�c���K��");

		System.out.println("����");
		System.out.println("�������`" + tanaka.name);
		System.out.println("�����ԍ�" + tanaka.number);
		System.out.println("�a���c��" + tanaka.balance);
	}
}
