import java.util.Scanner;
import java.util.Random;

public class java610 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		while (true) {
			battle(stdIn, rand);
			boolean isTryAgain = askTryAgain(stdIn);
			if (!isTryAgain) return;
		}
  	}

	private static void battle(Scanner stdIn, Random rand) {
		int compCount = 0;

		// Step 1: decide number of computers
		while (compCount <= 0) {
			System.out.print("�R���s���[�^�̎�̐�: ");
			try {
				compCount = stdIn.nextInt();
			} catch (Exception e) {
				stdIn.next(); // if input is not integer, skip it
			}
		}

		// Step 2: decide hands of computers
		int[] compHands = new int[compCount];
		for (int i = 0; i < compHands.length; i++) {
			compHands[i] = rand.nextInt(3);
		}

		// Step 3: decide user's hand
		String[] handNames = {"�O�[", "�`���L", "�p�["};

		int userHand = -1;
		while (userHand < 0 || 2 < userHand) {
			System.out.println("����񂯂�|��");
			for(int i = 0; i < 3; i++) {
				System.out.printf("%d : %s\n", i, handNames[i]);
			}
			System.out.print("> ");
			try {
				userHand = stdIn.nextInt();
			} catch (Exception e) {
				stdIn.next(); // if input is not integer, skip it
			}
		}

		// Step 6: judge result
		int winHand = (userHand + 1) % 3;
		int loseHand = (userHand + 2) % 3;
		boolean isWin = false;
		boolean isLose = false;
		for (int i = 0; i < compHands.length; i++) {
			if (compHands[i] == winHand) {
				isWin = true;
			} else if (compHands[i] == loseHand) {
				isLose = true;
			}
		}

		// Step 5: show result
		System.out.println("=== ���� ===");
		for (int i = 0; i < compCount; i++) {	
			System.out.println("com " + (i + 1) + " �� " + handNames[compHands[i]]);
		}
		System.out.println("���Ȃ� �� " + handNames[userHand]);
		System.out.println();
		
		if (isWin && !isLose) {
			System.out.println("���Ȃ��̏����ł�");
		} else if (!isWin && isLose) {
			System.out.println("���Ȃ��̕����ł�");
		} else {
			System.out.println("���������ł�");
		}
	}

	private static boolean askTryAgain(Scanner stdIn) {
		int answer = -1;
		while (answer != 0 && answer != 1) {
			System.out.println("������x�H �O: ������ �P: �͂�");
			System.out.print("> ");
			try {
				answer = stdIn.nextInt();
			} catch (Exception e) {
				stdIn.next(); // if input is not integer, skip it
			}
		}
		return answer == 1;
	}
}
