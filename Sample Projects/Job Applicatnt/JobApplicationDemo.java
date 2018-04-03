package OOPS_CLASS;
//import scanner
import java.util.Scanner;
public class JobApplicationDemo {

	
	
	public static void main(String[] args) {
		
		
		//create scanner
		Scanner sc = new Scanner(System.in);
		String name, phone,temp;
		boolean wP,dB,sS,gP;
		
		//prompt user for info
		System.out.println("Enter the name of applicant");
		name= sc.nextLine();
		
		System.out.println("Enter the phone number of applicant");
		phone = sc.nextLine();
		
		System.out.println("Applicant knows SpreadSheet? ('Yes' or 'No')");
		temp= sc.nextLine();
		if (temp.equalsIgnoreCase("yes"))	
		sS= true;
		else 
		sS= false;
		
		System.out.println("Applicant knows Word Processing? ('Yes' or 'No')");
		temp= sc.nextLine();
		if (temp.equalsIgnoreCase("yes"))	
		wP= true;
		else 
		wP= false;
		
		System.out.println("Applicant knows graphics? ('Yes' or 'No')");
		temp= sc.nextLine();
		if (temp.equalsIgnoreCase("yes"))	
		gP= true;
		else 
		gP= false;
		
		System.out.println("Applicant knows database? ('Yes' or 'No')");
		temp= sc.nextLine();
		if (temp.equalsIgnoreCase("yes"))	
		dB= true;
		else 
		dB= false;
		
		
		//create one job applicant
		
		JobApplicant j1= new JobApplicant(name,phone,wP,sS,dB,gP);
		j1.display();
		
		
	}
		

}
