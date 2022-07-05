import java.util.Arrays;

public class java6174 {

	public static void main(String[] args) {
		int[]fac = {4,2,7,1,9,6,3,4};
		int n = 5;
		System.out.println("”z—ñb=" + Arrays.toString(divide(fac,n)));
		

	}

	public static int[] divide(int[] fac,int n){
		
		System.out.println("”z—ña=" + Arrays.toString(fac));
		int[] result = new int[8];
		int count = 0;
		System.out.println("n=" + n);
		for (int i = 0; i < 8; i++) {
			if (fac[i] < n) {
				result[count] = fac[i];
				count += 1;
			}
			
		}return result;
		
		
	}
}
