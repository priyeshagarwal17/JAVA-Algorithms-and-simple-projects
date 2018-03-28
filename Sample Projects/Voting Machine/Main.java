

//import scanner
import java.util.Scanner;
public class Main {
//main method
	public static void main(String[] args) {
		
		//declare variables
				int democrats,republican,acceptance;
		//initialize scanner variable
				Scanner sc= new Scanner(System.in);
		
				System.out.println("Enter initial vote count for republican: ");
				republican= sc.nextInt();
				System.out.println("Enter initial vote count for democrats: ");
				democrats= sc.nextInt();
				//creating the VotingMachine Object		
				VotingMachine vm= new VotingMachine(democrats,republican);	
		
				System.out.println("Is this intitial vote acceptable for final count: (Enter 1 for yes and 0 for no)");
				acceptance = sc.nextInt();
		// condition
		//this condition will run only if acceptance == 0; acceptance is entered by user		
				if (acceptance == 0)	
				{vm.resetVotes();}	 
				
				vm.display();
			
	
	}
}
