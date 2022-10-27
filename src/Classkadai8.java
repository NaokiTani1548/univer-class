import java.util.Random;

public class Classkadai8 {

	public static void main(String[] args) {
		int x = 50;
		System.out.println(x + "ˆÈ‰º‚Ì‘f”F");
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomPrime(x));
		}
	}

	public static int RandomPrime(int x) {
		Random rand = new Random();
		int ran = 0;
		int count = 0;
		while (count != 1) {
			count = 0;
			ran = rand.nextInt(x);
			for (int i = 1; i < ran; i++) {
				if (ran % i == 0) {
					count += 1;
				}

			}
		}return ran;

	}

}
