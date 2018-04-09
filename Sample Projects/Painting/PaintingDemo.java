package OOPS_CLASS;
import java.util.Scanner;
public class PaintingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String title,artist,medium;
		double price;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the title of painting");
		title= sc.nextLine();
		System.out.println("Enter the medium of painting");
		medium= sc.nextLine();
		System.out.println("Enter the artist of painting");
		artist= sc.nextLine();
		System.out.println("Enter the price of painting");
		price= sc.nextDouble();
		
		Painting p1 = new Painting(title,artist,medium,price);
		p1.display();
		
		System.out.println("Enter new price of painting");
		price= sc.nextDouble();
		p1.setPrice(price);
		p1.display();
	}

}
