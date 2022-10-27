
public class Grade {
	String kaisekigaku;
	String sennkeidaisuugaku;
	String Java;
	double kaiseki;
	double sennkei;
	double java;
	double GPA;

	Grade(double kaiseki, double sennkei, double java) {
		this.kaiseki = kaiseki;
		this.sennkei = sennkei;
		this.java = java;
		kaisekigaku = "解析学";
		sennkeidaisuugaku = "線形代数学";
		Java = "Java";

	}

	void hyouka(int kaisekiP, int sennkeiP, int javaP) {
		this.kaiseki = kaisekiP;
		this.sennkei = sennkeiP;
		this.java = javaP;

	}

	double getGPA(double kaiseki, double sennkei, double java) {
		GPA = (kaiseki + sennkei + java) / 3;
		return GPA;

	}
}

class test {
	public static void main(String[] args) {
		int Ak = 3;
		int As = 4;
		int Aj = 2;
		Grade Akunn = new Grade(Ak, As, Aj);
		Akunn.getGPA(Ak, As, Aj);
		System.out.println("■A君の成績");
		System.out.println(Akunn.kaisekigaku + "の評点　" + (int) Akunn.kaiseki);
		System.out.println(Akunn.sennkeidaisuugaku + "の評点　" + (int) Akunn.sennkei);
		System.out.println(Akunn.Java + "の評点　" + (int) Akunn.java);
		System.out.println("GPA = " + Akunn.GPA);

		int Bk = 2;
		int Bs = 4;
		int Bj = 5;
		Grade Bkunn = new Grade(Bk, Bs, Bj);
		Bkunn.getGPA(Bk, Bs, Bj);
		System.out.println("■B君の成績");
		System.out.println(Bkunn.kaisekigaku + "の評点　" + (int) Bkunn.kaiseki);
		System.out.println(Bkunn.sennkeidaisuugaku + "の評点　" + (int) Bkunn.sennkei);
		System.out.println(Bkunn.Java + "の評点　" + (int) Bkunn.java);
		System.out.println("GPA = " + Bkunn.GPA);
	}

}
