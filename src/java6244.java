
public class java6244 {

	public static void main(String[] args) {
		double[] a = { 1, 5, 6, 8, 10, 13, 14, 17, 24, 31, 35, 39, 44, 45, 48 };
		int x = 22;
		int count = 0;
		int num = 0;
		int compare = a.length / 2;
		int comfac = 4;
		for (int i = 0; i < 6; i++) {
			if (x < a[compare]) {
				compare -= comfac;
			} else if (x > a[compare]) {
				compare += comfac;
			} else {
				count += 1;
				num = compare;

				break;

			}
			comfac = comfac / 2;
		}
		if (count == 0) {
			System.out.println("”z—ña‚Ì’†‚É" + x + "‚ÍŒ©‚Â‚©‚è‚Ü‚¹‚ñ‚Å‚µ‚½");
		} else {
			System.out.println(x + "‚Í”z—ña‚Ì" + num + "”Ô–Ú‚Ì—v‘f‚Å‚·");
		}

	}

}
