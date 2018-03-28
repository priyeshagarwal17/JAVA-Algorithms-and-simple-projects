package OOPS_CLASS;

public class BankAccount {
//data field
	private String name;
	private double bal;
	private int accno;
	
	//constructor
	public BankAccount()
	{
		this.name=name;
		
		//4 digit random no.
		this.accno=(int)(Math.random()*9000+1000);
		this.bal=bal;
	
	}
	//methods
	
	/*
	 * name: setName
	 * input: String
	 * output: -
	 * 
	 */
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	/*
	 * name: getBalance
	 * input: -
	 * output: double
	 * 
	 * 
	 */
	 public double getBalance()
	 {
		 return bal;
	 }
	
	 /*
	  * 
	  * name: deposit
	  * input: double
	  * output: void
	  * 
	  */
		 
	 public void deposit(double amount)
	 {bal+=amount;}
	
	 /*
	  * 
	  * name: withdraw
	  * input: double
	  * output: void
	  * 
	  */
	 
	 public void withdraw(double amount)
	
	 {
		 if (amount>bal)
			 System.out.println("Requested amount is greater than current balance. Please enter amount which is lesser than current aacount balance ");
		 else
			 bal-=amount;	// balance = balance- amount; 
	 }
	 
	
	 /*
	  * name: deductFee
	  * input: -
	  * output 
	  */
	 
	 public void deductFee()
	 {
		 bal-=4.00;
		 System.out.println("monthy service fee deducted");
	 }
	 
	 /*
	  * name: explainAccountPolicy
	  * input: static
	  * output: static
	  * note: static
	  * 
	  */
	 public static void explainAccountPolicy()
	 {
		 
		 System.out.println("Monthly service fee is deducted due to bank policies, 4$ fee will be duduected every month section 111110000222555ABSD");
	 }
	 
	 /*
	  * 
	  * name: display
	  * input : -
	  * output : void
	  */
	 
	
	 
	 
	 public void display()
	 
	 {
		 System.out.println("-----------------------------------------");
		 System.out.println("Account description");
		 System.out.printf("%-20s %s \n", "Acount Holder Name",name);
		 System.out.printf("%-20s %d \n", "Acount Number",accno);
		 System.out.printf("%-20s $%.2f \n", "Acount Balance",bal);
		 System.out.println("-----------------------------------------");
	 }
	 
	 
	 
}
