package OOPS_CLASS;

public class UseCarRental {
		
	public static void main(String[] args) {
		CarRental c1 = new CarRental("John" , "75080" , "midsize" , 7);
		c1.display(); 
		
		System.out.println("-----------------------------------------");

		LuxuryCarRental c2 = new LuxuryCarRental("John", "75080", 7, true);
		c2.display();
		}

}
