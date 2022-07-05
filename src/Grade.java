
public class Grade {
	int kaiseki;
	int sennkei;
	int java;
	
	
	
	Grade(int a,int b,int c){
		kaiseki = a;
		sennkei = b;
		java    = c;
		
	}
	int hyouka(int a,int b,int c) {
		return a; return b; return c;
	}
	}
  class test {
	public static void main(String[] args) {
		int Ak = 3;
		int As = 4;
		int Aj = 2;
		Grade Akunn = new Grade(Ak,As,Aj);
		System.out.println(Akunn.hyouka(Ak,As,Aj));
		
		int Bk = 2;
		int Bs = 4;
		int Bj = 5;
		Grade Bkunn = new Grade(Bk,Bs,Bj);
		System.out.println(Bkunn.hyouka(Bk,Bs,Bj));
		
		
		

	}

}

