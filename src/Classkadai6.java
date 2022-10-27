
public class Classkadai6 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				if (i != 4) {
					System.out.print(" ");
				}
			}
			for (int l = 0; l < (2 * i) + 1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				if (i != 0) {
					System.out.print(" ");
				}
			}
			for (int l = 0; l < (2 * (4 - i)) + 1; l++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}
