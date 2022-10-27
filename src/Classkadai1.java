
public class Classkadai1 {

	public static void main(String[] args) {
		DrawLabel(-9); System.out.println();
		DrawLabel(-3); System.out.println();
		DrawLabel(0); System.out.println();
		DrawLabel(4); System.out.println();
		DrawLabel(8); System.out.println();
		}
		public static void DrawLabel(int val) {
			if(val>0) {
				System.out.print("[+" + val + "]");
			}else if(val < 0) {
				System.out.print("[" + val + "]");
			}else {
				System.out.print("[0" + val + "]");
			}
}
}
