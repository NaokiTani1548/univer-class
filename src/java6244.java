
class java6244 {
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

		java6224 tanaka = new Account701("足立幸一", "123456", 1000);

		tanaka.setName("田中幸一");

		System.out.println("口座");
		System.out.println("口座名義" + tanaka.name);
		System.out.println("口座番号" + tanaka.no);
		System.out.println("預金残高" + tanaka.balance);
	}
}
