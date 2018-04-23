


public class Patient extends Person{
	//data field variables
		
	int id;
	
	
	
	//constructor
	
	/*
	 * name: Patient
	 * input: String, int
	 * output:
	 * 
	 */
	public Patient(String n,int id) 
	{
		super(n);
		this.id = id;
	}
	//methods
	
	/*
	 * name: equals
	 * input: boolean
	 * output: Patient
	 * 
	 */
	public boolean equals(Patient p)
	{
		boolean b;
		int k,m=1;
		k= this.name.compareToIgnoreCase(p.name);
		if (this.id==p.id)
			m= 0;
		if (k+m ==0)
			b= true;
		else 
			b = false;
		return b;
	}
	
	
	
}
