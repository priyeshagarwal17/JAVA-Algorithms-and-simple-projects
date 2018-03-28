package OOPS_CLASS;
import java.util.Scanner;

public class BankAccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		String name;
		BankAccount b1= new BankAccount();
		b1.display();
		
		System.out.println("enter the account holde's name");
		name= sc.nextLine();
		
		b1.setName(name);
		b1.display();
		b1.deposit(6000);
		b1.display();
		b1.deductFee();
		b1.display();
		b1.explainAccountPolicy();
		
		b1.withdraw(2000);
		b1.display();
		
		BankAccount b2= new BankAccount();
		b2.display();
	}
	

}
