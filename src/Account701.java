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

		Account701 tanaka = new Account701("‘«—§Kˆê", "123456", 1000);

		tanaka.setName("“c’†Kˆê");

		System.out.println("ŒûÀ");
		System.out.println("ŒûÀ–¼‹`" + tanaka.name);
		System.out.println("ŒûÀ”Ô†" + tanaka.no);
		System.out.println("—a‹àc‚" + tanaka.balance);
	}
}
