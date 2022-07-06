public class Account701 {
	public static void main(String[] args) {
		Account account = new Account("足立幸一", "123456", 1000);
		account.showAccountInfo(); // 足立幸一
		
		account.setName("田中幸一");
		account.showAccountInfo(); // 田中幸一
	}
}

class Account {
	private String userName;
	private String userId;
	private long balance;

	public Account(String userName, String userId, long balance) {
		// コンストラクタは初期化。変なAccountが作成されないように、本当はここで、ユーザーネームやIDが有効か（空でないか）、
		// 預金残高が有効か（マイナスでないか）などをチェックしたりする。今回は省略
		this.userName = userName;
		this.userId = userId;
		this.balance = balance;
	}

	public void setName(String newName) {
		// 同じく、有効な名前かどうかのチェックをここで本当はしたりする。
		this.userName = newName;
	}

	public void showAccountInfo() {
		System.out.println();
		System.out.println("口座");
		System.out.println("口座名義 " + this.userName);
		System.out.println("口座番号 " + this.userId);
		System.out.println("預金残高 " + this.balance);
	}
}
