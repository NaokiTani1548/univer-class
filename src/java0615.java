import java.util.Scanner;
import java.util.Random;

public class java0615 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		String[] hands = { "グー", "チョキ", "パー" };
		int retry = 0;
		int x;
		int y;
		int z;

		System.out.print("コンピュータの手の数");
		int n = stdIn.nextInt();
		int[] comp = new int[n];
		System.out.print("じゃんけんポン\n");
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
				System.out.print("com" + i + "が" + hands[comp[i]] + " ");
			}
			System.out.print("あなたがが" + hands[user]);
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
				System.out.println("\n引き分けです");
				break;
			case 1:
				System.out.println("\nあなたの負けです");
				break;
			case 2:
				System.out.println("\nあなたの勝ちです");

			}
			if (judge == 0) {
				retry = 1;
				System.out.print("あいこでしょ\n");
			} else {
				do {
					System.out.print("もう一度？０・・・いいえ　１・・・はい");
					retry = stdIn.nextInt();
				} while (retry != 0 && retry != 1);
			}
		} while (retry == 1);

	}

}
