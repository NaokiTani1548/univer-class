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

		Account701 tanaka = new Account701("‘«—§Kˆê", "123456", 1000);

		tanaka.setName("“c’†Kˆê");

		System.out.println("ŒûÀ");
		System.out.println("ŒûÀ–¼‹`" + tanaka.name);
		System.out.println("ŒûÀ”Ô†" + tanaka.number);
		System.out.println("—a‹àc‚" + tanaka.balance);
	}
}
