import java.util.Arrays;

public class java617 {

	public static void main(String[] args) {
		
		
		int []fac = {4,2,7,1,9,6,3,4};
		System.out.print("”z—ña="+Arrays.toString(fac));
		int []result = new int[8];
		for(int i = 0;i < 8;i++) {
			int moresm =10;
		 for(int j = 0;j < 8;j++) {
			 if(moresm > fac[j]) {
				 moresm = fac[j];
			 } 
		 }result[i] = moresm;
		 int overlup = 0;
		 for(int l = 0; l < 8; l++) {
			 if(moresm == fac[l] && overlup == 0) {
				 fac[l]=10;
				 overlup += 1;
				 
			 }
		 }
		
			
		}
	    System.out.println("”z—ñ‚‚"+ Arrays.toString(result) );
		
	}

}
