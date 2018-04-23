
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		//complete this part
		Scanner input = new Scanner(System.in);
		int a=-1,b=-1;	
		
		//a = number of doctors;
		//b = number of patients;
		while(a<=0)
		{
			System.out.println("Enter number of doctors in the facility: ");
			a= input.nextInt();
		
			
		}
		
		System.out.println();
		while(b<=0){
		System.out.println("Enter number of patients in the facility: ");
		b= input.nextInt();
		}
		Doctor[] docArray = new Doctor[a];
		Patient[] patArray = new Patient[b+1];
		
		System.out.println("-----------------------------");
		System.out.println("Create Doctor Array: ");
		System.out.println("-----------------------------");
		
		String name,speciality; double oVF;
		for (int i= 0; i<a; i++)
		{	
			System.out.println("Doctor "+(i+1));
			name = input.nextLine(); 
			System.out.println("Enter doctor's name: ");
			name = input.nextLine(); 
			System.out.println("Enter Specialty: ");
			speciality = input.nextLine(); 
			System.out.println("Enter office visit fee: ");
			oVF = input.nextDouble(); 
			 while (oVF < 0)
			 {
				 System.out.println("Office visit fee can not a negaive number! Try again. ");
				 System.out.println("Enter office visit fee: ");
					oVF = input.nextDouble(); 
			 }
		
			
			docArray[i] = new Doctor(name, speciality, oVF);
			System.out.println();
		
		}
		
		System.out.println("-----------------------------");
		System.out.println("Create Patient Array: ");
		System.out.println("-----------------------------");
		
		
		int id;
		for (int j= 0; j<b; j++)
		{
			System.out.println("Patient "+j);
			name = input.nextLine(); 
			System.out.println("Enter Patient's name: ");
			name = input.nextLine(); 
			System.out.println("Enter Patient ID: ");
			id = input.nextInt(); 
			
			while (id <999 || id >=10000)
			{
				System.out.println("Patient ID should be 4 digit number! Try again. ");
				System.out.println("Enter Patient ID: ");
				id = input.nextInt(); 
			}
			
			patArray[j]= new Patient(name,id);
			System.out.println();
		}	
		
	
		
		char check = 'y';  	//y or n
		int pi,di;
		while(check == 'y')
		{
			System.out.println("Enter Patient index: ");
			pi= input.nextInt();
			System.out.println("Enter Doctor index: ");
			di= input.nextInt();			
			for (int i= 0; i<a; i++)
				
			{	if (di==i)
				docArray[i].counter++;
			}
			
			System.out.println("Do you want to set another appointment? (y/n)");
			check = input.next().charAt(0);
				if (check !='y'||check != 'n') 
				{	
					while (check != 'y' && check !=  'n')
					{
						System.out.println("Invalid input! Try again. Do you want to set another appointment? (y/n)");
						check = input.next().charAt(0);
					}
				}
		}// while ends
		for (int i= 0; i<a; i++)
			docArray[i].display();
		
		
		
		
		System.out.println("Do you want check Doctor Object class: (y/n)");
		check = input.next().charAt(0); 
		if(check == 'y' || check == 'Y')
			checkObjectClassDoctor(input ,docArray[0]);
		
		System.out.println("Do you want check Patient object class: (y/n)");
		check = input.next().charAt(0); 
		if(check == 'y' || check == 'Y')
			checkObjectClassPatient(input, patArray[0]);
	}//main ends
	
	
	/*
	 * name: checkObjectClassDoctor
	 * input: void
	 * output: Scanner, Doctor
	 * 
	 */
		public static void checkObjectClassDoctor(Scanner input,Doctor d)
	{		String name = input.nextLine();
			System.out.println("Enter Doctor's name: ");
			name = input.nextLine(); 
			System.out.println("Enter Doctor's specialty: ");
			String specialty = input.nextLine(); 
			System.out.println("Enter office visit fee: ");
			double fee = input.nextDouble(); 	
			
			Doctor doc= new Doctor(name, specialty, fee); 
			if(d.hasSameName(doc))
				System.out.println("Same name");
			else
				System.out.println("Not have same name");
			if(d.equals(doc))
				System.out.println("Same doctor");
			else
				System.out.println("Not the same doctor");
	}
	
		
		/*
		 * name: checkObjectClassPatient
		 * input: void
		 * output: Scanner, Patient
		 * 
		 */
		public static void checkObjectClassPatient(Scanner input, Patient p) 
	{	String name = input.nextLine();
		System.out.println("Enter Patient's name: ");
		name = input.nextLine(); 
		System.out.println("Enter Patients's ID:");
		int id = input.nextInt(); 
		Patient pat = new Patient(name, id); 
		
		if(p.hasSameName(pat))
			System.out.println("Same name");
		else
			System.out.println("Not have same name");
		
		if(p.equals(pat))
			System.out.println("Same patient");
		else
			System.out.println("Not the same patient");
	}
}// end of class