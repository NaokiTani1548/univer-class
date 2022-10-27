
public class Shop {
	int numApple;
	int numOrange;
	int priceApple;
	int priceOrange;
	int sales;
	
	Shop(int numApple,int numOrange,int priceApple,int priceOrange,int sales){
		this.numApple = numApple;
		this.numOrange = numOrange;
		this.priceApple = priceApple;
		this.priceOrange = priceOrange;
		this.sales = sales;
	}
	void sellApple(int sApple) {
		numApple -= sApple;
		sales += sApple*priceApple;
	}
	void sellOrange(int sOrange) {
		numOrange -= sOrange;
		sales += sOrange*priceOrange;
	}
	double getSales() {return sales;}

}
class ShopExpression {
	
	public static void main(String[] args) {
		Shop shoptoday = new Shop(100,100,200,150,0);
		
		shoptoday.sellApple(25);
		shoptoday.sellOrange(10);
		
		System.out.println("îÑÇËè„Ç∞ÇÕ" +(int)shoptoday.getSales() + "â~");
	}
}
