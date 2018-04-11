package OOPS_CLASS;

public class CarRental {
//data field
	
	protected 	String name;
	protected	String zip;
	protected	String size;
	protected	double dailyFee;
	protected	int rentalDays;
	protected	double	totalFee;
	
	
	
//constructor
	
	public CarRental(String name,String zip,String size,int rentalDays)
	{
		this.name = name;
		this.zip = zip;
		this.size = size;
		this.rentalDays = rentalDays;
		this.dailyFee = dailyFee();
		this.totalFee= this.dailyFee*this.rentalDays;
		
	}
	
	
	
	
//methods
	/*
	 * 
	 * name:	dailyFee()
	 * input:	
	 * output:	double
	 */
	
	public double dailyFee()
	{
		
		if (size.equalsIgnoreCase("economy"))
			return 29.99;
		else if (size.equalsIgnoreCase("midsize"))
			return 38.99;
		else if (size.equalsIgnoreCase("full"))
			return 43.50;

		return 0.0;
	}
	
	/*
	 * 
	 * name:	display()
	 * input:	
	 * output:	void
	 */
	public void display()
	{
		System.out.println("------------------");
		System.out.printf("%-20s %s\n", "Name" , name); 
		System.out.printf("%-20s %s\n", "Zipcode" , zip); 
		System.out.printf("%-20s %s\n", "Size" , size);
		System.out.printf("%-20s $%.2f\n", "Daily Fee" , dailyFee);
		System.out.printf("%-20s %d\n", "length of rental" , rentalDays);
		System.out.printf("%-20s $%.2f\n", "Total Fee" , totalFee);
	}
	

}// end of class
