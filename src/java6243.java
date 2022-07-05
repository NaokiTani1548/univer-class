import java.util.Scanner;

public class java6243 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("x= ");
		int n = stdIn.nextInt();

		if (n >= 0) {
			for (int i = 1; i < 9; i++) {
				int m;
				m = n % 2;
				n = n / 2;
				System.out.println(i + "ビット目は" + m + "です。");
			}
		} else {
			int []result = new int[8];
			int l = (Math.abs(n) - 1);
			for (int i = 0; i < 7; i++) { 
				if(l % 2 == 0) {
					result[i] = 1;
				}else {
					result[i] = 0;
				}
				 l = l/2;
				System.out.println((i+1) + "ビット目は" + result[i] + "です。");
		}
			System.out.println("8ビット目は1です。");
		
	}
  }
}
