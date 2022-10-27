
public class Classkadai7 {

	public static void main(String[] args) {
	   for(int i = 0; i < 19;i++) {
		   if((i+1)%3 == 1) {
			  for(int j = 0; j < 3*(i/3);j++) {
				  if(i != 0) {
					  System.out.print(" ");
				  }
			  
			  }System.out.println("****");
		   }else {
			   for(int j = 0;j < 3*((i/3)+1);j++) {
				   System.out.print(" ");
			   }System.out.println("*");
		   }
	   }

	}

}
