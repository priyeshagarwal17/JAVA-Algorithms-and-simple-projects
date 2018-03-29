import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		double d1,d2;
		System.out.println("Enter real and imaginary part of the first complex number: ");	
		d1= sc.nextDouble();
		d2= sc.nextDouble();
		Complex c1 = new Complex(d1,d2);
		
		System.out.println("Enter real and imaginary part of the second complex number: ");	
		d1= sc.nextDouble();
		d2= sc.nextDouble();
		Complex c2 = new Complex(d1,d2);
		
		c1.toString(c1,c2);
	}

}
