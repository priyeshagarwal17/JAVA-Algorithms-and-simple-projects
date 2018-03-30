//import scanner
import java.util.Scanner;

public class Main {
//main method
	public static void main(String[] args) {
	//create scanner
		Scanner sc = new Scanner(System.in);
		String a;
		char c='x';
		
		
		System.out.println("Enter a sample text:");
		a= sc.nextLine();
		System.out.println();
		System.out.println("You entered: "+a);
		
		
		//while loop
		while (c!='q') 
		{
			printMenu();
			c= sc.next().charAt(0);
		switch (c)
		{
		
		case 'c' :
            System.out.println("Number of non-whitespace characters: "+getNumOfNonWSCharacters(a)); 
            break;
         case 'w' :
        	 System.out.println("Number of words: "+getNumOfWords(a));
        	 break;
         case 'f' :
            System.out.println("Enter a word or phrase to be found:");
            sc.nextLine();
            String st = sc.nextLine();
            System.out.println("\""+st+"\""+" instances: "+findText(st,a));
            break;
         case 'r' :
        	 System.out.println("Edited text: "+replaceExclamation(a));
        	 break;
         case 's' :
            System.out.println("Edited text: "+shortenSpace(a));
            break;
         case 'q' :
             break;
         default :
        	 printMenu();

		}
		
	
		}//while loop ends
		
		
	}//end of main
	
	/*
	 * name: printMenu()
	 * input: 
	 * output: void
	 */
	public static void printMenu()
	{	
		
				System.out.println();
				System.out.println("MENU\n" + 
						"c - Number of non-whitespace characters\n" + 
						"w - Number of words\n" + 
						"f - Find text\n" + 
						"r - Replace all !'s\n" + 
						"s - Shorten spaces\n" + 
						"q - Quit");
				System.out.println();
				System.out.println("Choose an option:");	
	}
	
	/*
	 * name: getNumOfNonWSCharacters
	 * input: String
	 * output: integer
	 */
	public static int getNumOfNonWSCharacters(String str)
	{
		
		
		int counter = 0;
		for(int i=0;i<str.length();i++)
		{
			if ( str.charAt(i) != ' ' )
			    counter++;
		}
		return counter;
		
	}
	

	/*
	 * name: getNumOfWords
	 * input: String
	 * output: integer
	 */
	public static int getNumOfWords(String str)
	{
        if(str == null || str.isEmpty())
            return 0;

        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ')
	            {
	                count++;
	                while(str.charAt(i) != ' ' && i < str.length()-1)
		                {
		                    i++;
		                }
	            }
        }
        	return count;
        }//countWords
       

	/*
	 * name: findText
	 * input: String
	 * output: integer
	 */

	public static int findText(String k, String str)
	{ 	int i= 0;
		int j= 0;
		
	while ((j = str.indexOf(k, j)) != -1)
    {
       j++;
       i++;
    }
		return i;
	}
	

	/*
	 * name: replaceExclamation
	 * input: String
	 * output: String 
	 */
	public static String replaceExclamation(String str)
	{
		for (int j = 0; j < str.length(); j++)
		{str = str.replace('!','.');}
		return str;
	}//replaceExclamation
	

	/*
	 * name: shortenSpace
	 * input: String
	 * output: String
	 */
	public static String shortenSpace(String str)
	{	
			String str1 = str.replaceAll(" +", " ");
		return str1;
	}//shortenSpace
		
}
