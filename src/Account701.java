class Account701 {
	String name;
	String no;
	long balance;

	public static void main(String[] args) {

	}

	Account701(String n, String num, long z) {
		name = n;
		no = num;
		balance = z;
	}

	void setName(String x) {
		name = x;

	}
}

class AccountTester {
	public static void main(String[] args) {

		Account701 tanaka = new Account701("�����K��", "123456", 1000);

		tanaka.setName("�c���K��");

		System.out.println("����");
		System.out.println("�������`" + tanaka.name);
		System.out.println("�����ԍ�" + tanaka.no);
		System.out.println("�a���c��" + tanaka.balance);
	}
}
