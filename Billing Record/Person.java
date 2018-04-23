

public class Person {
	//data field variables
	String name;
	
	
	//constructor
	/*
	 * name: Person
	 * input: String
	 * output:
	 * 
	 */
		public Person(String n)
		{
			name = n;
		}
	
	//methods
	
		/*
		 * name: getName
		 * input: 
		 * output: String
		 * 
		 */
		public String getName()
		{
			return name;
		}
		
		/*
		 * name: setName
		 * input: String
		 * output: 
		 * 
		 */
		public void setName(String n)
		{
			name = n;
		}
		
		/*
		 * name: display
		 * input: void
		 * output: 
		 * 
		 */
		public void display()
		{
			System.out.printf("%-20s %s\n", "Name", name);
			
		}
		/*
		 * name: hasSameName
		 * input: boolean
		 * output: Person
		 * 
		 */
		public boolean hasSameName(Person n)
		{	int k=2;
		boolean b;
		k= this.name.compareToIgnoreCase(n.name);
		if (k==0)
			b= true;
		
		else
			b= false;
		
		return b;
		
		}
			
		
		
		
	
}//end of class
