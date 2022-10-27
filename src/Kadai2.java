class Rectangle {
	double width;
	double height;
	double area;

	Rectangle(double w, double h) {
		width = w;
		height = h;
		this.area =area; 
	}

	double getArea(double width, double height) {
		area = width * height;
		return area;

	}
}

public class Kadai2 {

	public static void main(String[] args) {
		double width = 3.0;
		double height = 2.0;
		Rectangle mennseki = new Rectangle(width, height);
		mennseki.getArea(width, height);
		System.out.print("’·•ûŒ`‚Ì–ÊÏ‚Í" + mennseki.area);
	}

}
