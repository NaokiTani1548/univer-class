import java.util.Scanner;
import java.util.Random;

public class java0615 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		String[] hands = { "�O�[", "�`���L", "�p�[" };
		int retry = 0;
		int x;
		int y;
		int z;

		System.out.print("�R���s���[�^�̎�̐�");
		int n = stdIn.nextInt();
		int[] comp = new int[n];
		System.out.print("����񂯂�|��\n");
		do {
			for (int i = 0; i < n; i++) {
				comp[i] = rand.nextInt(3);
			}
			int user;

			do {
				x = 0;
				y = 0;
				z = 0;

				for (int i = 0; i < 3; i++) {
					System.out.printf("(%d)%s", i, hands[i]);
				}
				System.out.print(":");
				user = stdIn.nextInt();
			} while (user < 0 || user > 2);
			for (int i = 0; i < n; i++) {
				System.out.print("com" + i + "��" + hands[comp[i]] + " ");
			}
			System.out.print("���Ȃ�����" + hands[user]);
			int judge = 0;

			switch (user) {
			case 0:
				for (int i = 0; i < n; i++) {
					if (comp[i] != 0)
						x = x + 1;
				}
				if (x == 0) {
					judge = 0;
					break;
				}
				for (int j = 0; j < n; j++) {
					if (comp[j] == 2)
						y = y + 1;
				}
				if (y == 0) {
					judge = 2;
					break;
				}
				for (int l = 0; l < n; l++) {
					if (comp[l] == 1)
						z = z + 1;
				}
				if (z == 0) {
					judge = 1;
					break;
				}
				judge = 0;
				break;
			case 1:
				for (int i = 0; i < n; i++) {
					if (comp[i] != 1)
						x = x + 1;
				}
				if (x == 0) {
					judge = 0;
					break;
				}
				for (int j = 0; j < n; j++) {
					if (comp[j] == 0)
						y = y + 1;
				}
				if (y == 0) {
					judge = 2;
					break;
				}
				for (int l = 0; l < n; l++) {
					if (comp[l] == 2)
						z = z + 1;
				}
				if (z == 0) {
					judge = 1;
					break;
				}
				judge = 0;
				break;
			case 2:
				for (int i = 0; i < n; i++) {
					if (comp[i] != 2)
						x = x + 1;
				}
				if (x == 0) {
					judge = 0;
					break;
				}
				for (int j = 0; j < n; j++) {
					if (comp[j] == 1)
						y = y + 1;
				}
				if (y == 0) {
					judge = 2;
					break;
				}
				for (int l = 0; l < n; l++) {
					if (comp[l] == 0)
						z = z + 1;
				}
				if (z == 0) {
					judge = 1;
					break;
				}
				judge = 0;
				break;
			}
			switch (judge) {
			case 0:
				System.out.println("\n���������ł�");
				break;
			case 1:
				System.out.println("\n���Ȃ��̕����ł�");
				break;
			case 2:
				System.out.println("\n���Ȃ��̏����ł�");

			}
			if (judge == 0) {
				retry = 1;
				System.out.print("�������ł���\n");
			} else {
				do {
					System.out.print("������x�H�O�E�E�E�������@�P�E�E�E�͂�");
					retry = stdIn.nextInt();
				} while (retry != 0 && retry != 1);
			}
		} while (retry == 1);

	}

}
