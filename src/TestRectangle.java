
class Rectangle000 {
	double x; // ������ x ���W
	double y; // ������ y ���W
	double width; // �����`�̕�
	double height; // �����`�̍���


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
	    
		System.out.println("�����`�̍����� x ���W: " + x + "�Cy ���W: " + y);
		System.out.println("�����`�̕�: " + width + "�C����: " + height);
		
		Rectangle000 kadai9 = new Rectangle000(x,y,width,height);
		 double area = kadai9.calcArea(x, y, width, height);
		System.out.println("�����`�̂��� x>=0.0 ���� y>=0.0 �̕����̖ʐ� = " + area);
	}
}
