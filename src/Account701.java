public class Account701 {
	public static void main(String[] args) {
		Account account = new Account("�����K��", "123456", 1000);
		account.showAccountInfo(); // �����K��
		
		account.setName("�c���K��");
		account.showAccountInfo(); // �c���K��
	}
}

class Account {
	private String userName;
	private String userId;
	private long balance;

	public Account(String userName, String userId, long balance) {
		// �R���X�g���N�^�͏������B�ς�Account���쐬����Ȃ��悤�ɁA�{���͂����ŁA���[�U�[�l�[����ID���L�����i��łȂ����j�A
		// �a���c�����L�����i�}�C�i�X�łȂ����j�Ȃǂ��`�F�b�N�����肷��B����͏ȗ�
		this.userName = userName;
		this.userId = userId;
		this.balance = balance;
	}

	public void setName(String newName) {
		// �������A�L���Ȗ��O���ǂ����̃`�F�b�N�������Ŗ{���͂����肷��B
		this.userName = newName;
	}

	public void showAccountInfo() {
		System.out.println();
		System.out.println("����");
		System.out.println("�������` " + this.userName);
		System.out.println("�����ԍ� " + this.userId);
		System.out.println("�a���c�� " + this.balance);
	}
}
