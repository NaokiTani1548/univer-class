
class Rectangle000 {
	double x; // 左下の x 座標
	double y; // 左下の y 座標
	double width; // 長方形の幅
	double height; // 長方形の高さ


	Rectangle000(double x, double y, double width, double height ) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	double calcArea(double x,double y,double width,double height) {
		double xa = 0;
		double ya = 0;
		if(x < 0) {
			xa = -x;
		}else if(y < 0) {
			ya = -y;
		}
	    double answer = (width-xa)*(height-ya);
		return answer;
	}
}

public class TestRectangle {
	public static void main(String[] args) {
		double x = 1.0;
		double y = -3.0;
		double width = 3.0;
		double height = 5.0;
	    
		System.out.println("長方形の左下の x 座標: " + x + "，y 座標: " + y);
		System.out.println("長方形の幅: " + width + "，高さ: " + height);
		
		Rectangle000 kadai9 = new Rectangle000(x,y,width,height);
		 double area = kadai9.calcArea(x, y, width, height);
		System.out.println("長方形のうち x>=0.0 かつ y>=0.0 の部分の面積 = " + area);
	}
}
