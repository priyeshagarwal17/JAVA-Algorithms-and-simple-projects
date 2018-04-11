package OOPS_CLASS;


public class LuxuryCarRental extends CarRental{
	//data field - 
	protected boolean chauffeur; 
	
	//constructor
	public LuxuryCarRental(String name, String zipcode, int days , boolean chauffeur) {
		//1 - super
		super(name, zipcode, "Luxury" , days); 
		super.dailyFee = 79.99; 
		//2 - initialize local data field variables
		this.chauffeur = chauffeur; 
		super.totalFee = getTotalFee(); 
	}
	
	//methods
	/*
	 * name: getTotalFee
	 * input: - 
	 * output: double
	 */
	public double getTotalFee() {
		double totalFee;
		if(chauffeur)
			totalFee = (dailyFee + 200) * rentalDays; 
		else
			totalFee = dailyFee * rentalDays; 
		
		return totalFee; 
	}
	
	/*
	 * name: display
	 * input: -
	 * output: void
	 */
	public void display() {
		System.out.printf("%-20s %s\n", "Name" , name); 
		System.out.printf("%-20s %s\n", "Zipcode" , zip); 
		System.out.printf("%-20s %s\n", "Size" , size);
		System.out.printf("%-20s $%.2f\n", "Daily Fee" , dailyFee);
		System.out.printf("%-20s %d\n", "length of rental" , rentalDays); 
		System.out.printf("%-20s %s\n", "Chauffeur" , yesNo()); 
		System.out.printf("%-20s $%.2f\n", "Total Fee" , totalFee);
	}
	
	public String yesNo() {
		if(chauffeur)
			return "Yes"; 
		else 
			return "No"; 
	}
}




