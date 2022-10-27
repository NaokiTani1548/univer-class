
public class Classkadai3 {
	public static void main(String[] args) {
		char acgt[] = { 'A', 'A', 'A', 'A', 'C', 'C', 'C', 'G', 'G', 'T' };
		for (int i = 0; i < acgt.length; i++) {
			int ran = (int) (Math.random() * (9 - i));
			System.out.print(acgt[ran]);
			for (int j = 0; j < 9 - ran; j++) {
				if (ran < 10) {
					acgt[ran + j] = acgt[ran + j + 1];
				}
			}
		}
	}
}