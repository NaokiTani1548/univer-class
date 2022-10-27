//import java.util.Random;

public abstract class Classkadai5 {
	public static void main(String[] args) {
		int n = 100;
		int sum[] = new int[10];
		int count;
		for (int i = 0; i < 10; i++) {
			sum[i] = 0;
		}
		//Random rand = new Random();
		for (int i = 0; i < n; i++) {
			int rannsuu = (int)(Math.random()*10000);
			System.out.println("—”" + (i + 1) + "ŒÂ–Ú:" + rannsuu);
			count = (int)(rannsuu / 1000);
			sum[count] += 1;

		}for(int j = 0; j<10;j++) {
			System.out.println(j*0 +"ˆÈã"+ (j+1)*1000 + "–¢–‚Ì”:" +sum[j]);
		}

	}
}