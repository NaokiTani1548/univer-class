import java.util.Scanner;
import java.util.Arrays;
public class java6173 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("表示する素数の数");
		int exnum = stdIn.nextInt();
		System.out.println("配列b=" + Arrays.toString(sosuu(exnum)));
	}
	
		public static int[] sosuu(int exnum) {
			int count = 0;
			int fac = 1;
			
			int []result = new int[exnum];
			
			while(count < exnum) {
				int forcount = 0;
				fac += 1;
				for(int i = 1; i < fac; i++) {
					if(fac % i == 0) {
						forcount += 1;
					}
						
				}if(forcount < 2) {
					result[count] = fac;
					count += 1;
				}
			}return result;
			
		}
	}
