
public class testsample {

	public static void main(String[] args) {
		int a = 12144;
		int b = 2400;
		int count = 2;
		int counter = 0;
		while (count < 4) {
			while (counter == 0) {
				counter = 0;
				if (a % count == 0 && b % count == 0) {
					a = a / count;
					b = b / count;
				} else {
					counter += 1;
				}
			}
			count += 1;
			System.out.println(count);

		}
		System.out.print(a + "/" + b);

	}

}
