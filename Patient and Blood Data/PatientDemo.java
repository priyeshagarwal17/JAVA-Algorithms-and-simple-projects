package OOPS_CLASS;
import java.util.Random;

public class PatientDemo {

	public static void main(String[] args) {
		//Create object patient
		Random randGen= new Random();
		randGen.setSeed(0);
		Patient p1= new Patient();
		p1.display();
		Patient p2 = new Patient(22,"AB+",'c',randGen.nextInt(90000)+10000);
		p2.display();
		Patient p3 = new Patient(23,"AB+",'c',randGen.nextInt(90000)+10000);
		p3.display();
		
		
	}

}
