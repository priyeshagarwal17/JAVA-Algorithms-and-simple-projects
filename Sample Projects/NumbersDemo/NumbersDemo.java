package OOPS_CLASS;
import java.util.*;
public class NumbersDemo {
	
	
	/*name	displayTwicetheNumber
	 * input int,int
	 * output VOID
	 */
	
	
	public static void displayTwicetheNumber(int x,int y)
	{	System.out.println("one number = "+x);
		x=x*2;
		System.out.println("twice the number is "+x);
		System.out.println();
		System.out.println("another number = "+y);
		y=y*2;
		System.out.println("twice the number is "+y);
		System.out.println();	System.out.println();
	}
	
	/*name	displayNumberPlusFive
	 * input int,int
	 * output VOID
	 */
	
	public static void displayNumberPlusFive(int x,int y)
	{	
		System.out.println();
		System.out.println("one number = "+x);
		x=x+5;
		System.out.println("this number +5 is "+x);
		System.out.println();
		System.out.println("another number = "+y);
		y=y+5;
		System.out.println("this number +5 is "+y);
		System.out.println();
	}
	
	/*name	displaySquared
	 * input int,int
	 * output VOID
	 */
	public static void displaySquared(int x,int y)
	{	System.out.println();
		System.out.println("one number = "+x);
		x=x*x;
		System.out.println("this number's square is "+x);
		System.out.println();
		System.out.println("another number = "+y);
		y=y*y;
		System.out.println("this number's square is "+y);
	}
	
	
	public static void main(String args[])
	{
int k,l;

Scanner sc= new Scanner(System.in);
System.out.println("enter two numbers");
k=sc.nextInt();
l=sc.nextInt();
displaySquared(k,l);
displayNumberPlusFive(k,l);
displayTwicetheNumber(k,l);
	}
}
