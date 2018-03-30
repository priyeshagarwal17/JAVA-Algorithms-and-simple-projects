package OOPS_CLASS;
import java.util.Scanner;
public class CircleDemo {

	public static void main(String[] args) {
		//create Scanner
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter radius");
		double r = sc.nextDouble();
		
		while (r<=0)
		{
			System.out.println("Enter radius (a non negative number)");
			r = sc.nextDouble();
		}
		
		Circle c1= new Circle(r);
		c1.display();
		// create one object of data type circle
			
		/*		Circle c1= new Circle();
			c1.display();
			System.out.println();
			c1.radius=5.5;
			c1.display();
			System.out.println();
			System.out.println(c1.area());
			System.out.println();
			c1.setRadius(6.0);
			c1.display();
			
			Circle c2= new Circle(22.3);
			c2.display();
	
		 */		
		

		
		
		
	
	}

}
