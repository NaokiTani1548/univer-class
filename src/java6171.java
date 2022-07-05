import java.util.Arrays;

public class java6171 {

	public static void main(String[] args) {
		double[] fac = { 0.3, 0.5, 0.1, 1.0, 0.4, 0.6, 0.7, 0.1 };
		System.out.println("a‚Ì—v‘f‚Ì•ªŽU" + (bunnsann(fac)));

	}

	public static double bunnsann(double[] fac) {
		System.out.println("”z—ña=" + Arrays.toString(fac));
		double sum = 0;
		double result;
		double ber;
		double factor = 0;
		for (int i = 0; i < fac.length; i++) {
			sum += fac[i];
		}
		ber = sum / fac.length;
		for (int j = 0; j < fac.length; j++) {
			factor = factor + (fac[j] - ber) * (fac[j] - ber);
		}
		result = factor / fac.length;
		return result;

	}
}
