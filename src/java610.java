import java.util.Scanner;
import java.util.Random;

public class java610 {

		public static void main(String[] args) {
			Scanner stdIn =new Scanner(System.in);
			Random rand = new Random();
			
			String[] hands = {"グー","チョキ","パー"};
			int retry =0;
			do {
				System.out.print("コンピュータの手の数");
				int n = stdIn.nextInt();
				int[]comp = new int[n];
				for(int i = 0; i < n ; i++) {
					comp[i] = rand.nextInt(3);
				}
				int user;
				do {
					System.out.print("じゃんけんポン\n");
					for(int i = 0; i < 3 ; i++) {
						System.out.printf("(%d)%s",i,hands[i]);
				    }
					System.out.print(":");
				    user=stdIn.nextInt();
			    }while(user<0||user>2);
			   for(int i = 0; i < n ; i++) {	
				  System.out.print("com"+i+"が"+hands[comp[i]]+" ");
				 }System.out.print("あなたがが"+hands[user]);
				 int judge = 0;
				
				int winHand; int loseHand;
				switch(user) {
					case 0: winHand = 1; loseHand = 2; break;
					case 1: winHand = 2; loseHand = 0; break;     
					case 2: winHand = 0; loseHand = 1; break;
					default: throw new Error();
				}

				int sameHandCount = 0;
				int winHandCount = 0;
				int loseHandCount = 0;
				for (int i = 0; i < n; i++) {
					if (comp[i] == user) sameHandCount ++;
				}
				for (int j = 0 ; j < n; j++) {
				    if (comp[j] == loseHand) loseHandCount ++;
				}
				for (int l = 0; l < n; l++) {
				    if (comp[l] == winHand) winHandCount ++; 
				}

				if (sameHandCount == comp.length) judge = 0;
				else if (winHandCount == 0) judge = 1;
				else if (loseHandCount == 0) judge = 2;
				else judge = 0;

				switch(judge) {
				case 0: System.out.println("\n引き分けです");break;
				case 1: System.out.println("\nあなたの負けです");break;
				case 2: System.out.println("\nあなたの勝ちです");
				
				}
				do {
					System.out.print("もう一度？０・・・いいえ　１・・・はい");
					retry =stdIn.nextInt();
				}while(retry != 0 && retry != 1);

		}while(retry==1);
			
  }
}



