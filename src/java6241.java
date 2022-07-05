import java.util.Arrays;

public class java6241 {

	public static void main(String[] args) {
		int[] fac = {65,70,89,43,95,22,60,58};
		System.out.println("a‚Ì—v‘f‚Ì•ªŽU" + (bunnsann(fac)));
	

	}
	public static double bunnsann(int[] fac) {
		System.out.println("”z—ña=" + Arrays.toString(fac));
		double result;
		double sum = 0;
		double heikinn;
		double wa = 0;
		for(int i = 0; i < fac.length;i++) {
			sum += fac[i];
		}
		heikinn = sum/fac.length;
		for(int i = 0; i < fac.length;i++) {
			wa += (fac[i] - heikinn)*(fac[i] - heikinn);
		}
		result=wa/fac.length;
		return result;
		
 }
}
