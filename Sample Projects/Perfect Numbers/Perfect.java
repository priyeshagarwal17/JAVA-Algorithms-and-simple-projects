package OOPS_CLASS;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.println("A perfect number is one that equals the sum of all the numbers that divide evenly into it.");
		System.out.println();
	/*	System.out.println("Enter a number to check it is a perfect number or not ");
		int num = sc.nextInt();
	*/	
		
		for (int i = 1; i<= 1000; i++)
			
		{
			boolean b;
			
			b = isPerfect(i);
			if (b)
			{
				System.out.println(i+" is a perfect number");
			}
			

			
		}
		
	}// end of main
	
	public static boolean isPerfect(int num)
	{
		int k =0;
		
		for (int i = 1; i< num; i++)
			{
			if (num% i ==0)
				k+=i;
			}
		if (k==num)
			return true;
		else 
			return false;
		
	}
	
	

}// end of class
