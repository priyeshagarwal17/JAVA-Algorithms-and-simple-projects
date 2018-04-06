package OOPS_CLASS;
import java.util.Scanner;

public class AscendingAndDescending {
	public static  void ascending(int a1 , int b1 , int c1)
	{	
		int a=a1;
		int b=b1;
		int c=c1;
		
		if((a>b) &&(a>c))
		{
			if (b>c)
				System.out.println("Numbers in Decending order :"+c+","+b+","+a);
			else
				System.out.println("Numbers in Decending order :"+b+","+c+","+a);
		}
		else 
		if ((b>a) &&(b>c))
		{	if (a>c)
				System.out.println("Numbers in Decending order :"+c+","+a+","+b);
			else
				System.out.println("Numbers in Decending order :"+a+","+c+","+b);
		}
		else 
		{
			if (b>a)
				System.out.println("Numbers in Decending order :"+a+","+b+","+c);
			else
				System.out.println("Numbers in Decending order :"+b+","+a+","+c);
				
		}
	}
	public static  void descending(int a1 , int b1 , int c1)
	{	
		int a=a1;
		int b=b1;
		int c=c1;
		
		if((a<b) &&(a<c))
		{
			if (b<c)
				System.out.println("Numbers in Ascending order :"+c+","+b+","+a);
			else
				System.out.println("Numbers in Ascending order :"+b+","+c+","+a);
		}
		else 
		if ((b<a) &&(b<c))
		{	if (a<c)
				System.out.println("Numbers in Ascending order :"+c+","+a+","+b);
			else
				System.out.println("Numbers in Ascending order :"+a+","+c+","+b);
		}
		else 
		{
			if (b<a)
				System.out.println("Numbers in Ascending order :"+a+","+b+","+c);
			else
				System.out.println("Numbers in Ascending order :"+b+","+a+","+c);
				
		}
	}
public static void main(String[] args) {
		
		
Scanner sc= new Scanner(System.in);
		
int a,b,c;

System.out.println("enter first number");
a=sc.nextInt();
System.out.println("enter second number");
b=sc.nextInt();
System.out.println("enter third number");
c=sc.nextInt();

ascending(a,b,c);
descending(a,b,c);


	}


		
	}


