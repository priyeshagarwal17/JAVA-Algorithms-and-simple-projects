


public class Doctor extends Person {
	//data field variables
	

	String speciality;
	Double oVF;
	Double income=0.00;
	int counter;
	//constructor
	
	/*
	 * name: Doctor
	 * input: String, String, double
	 * output:
	 * 
	 */
	public Doctor(String n,String speciality,Double oVF) 
	{
		super(n);
		this.speciality=speciality;
		this.oVF=oVF;
		this.counter = 0;
		
	}
	
	

	//methods
	//get
	
	/*
	 * name: getDrName
	 * input: 
	 * output: String 
	 * 
	 */
	public String getdrName()
	{	String s;
		s= getName();
		return s;	
	}
	

	/*
	 * name: getSpeciality
	 * input: 
	 * output: String 
	 * 
	 */
	public String getSpeciality()
	{
		return speciality;
	}
	/*
	 * name: getoVF
	 * input: 
	 * output: double 
	 * 
	 */
	
	public double getoVF()
	{
		return oVF;
	}
	//set
	
	
	/*
	 * name: setdrName
	 * input: String
	 * output:  void
	 * 
	 */
	
	public void setdrName(String x)
	{
		setName(x);
	}
	/*
	 * name: setSpeciality
	 * input: String
	 * output:  void
	 * 
	 */
	public void setSpeciality(String x)
	{
		speciality=x;
	}
	/*
	 * name: setoVF
	 * input: double
	 * output:  void
	 * 
	 */
	public void setoVF(double o)
	{
		oVF = o;
	}
	
	/*
	 * name: setIncome
	 * input: int
	 * output:  void
	 * 
	 */
	public void setIncome(int counter)
	{
		income = oVF * counter;
	}
	
	
	/*
	 * name: equals
	 * input: boolean
	 * output: Doctor
	 * 
	 */
	public boolean equals(Doctor d)
	{
		boolean b;
		int k,l,m= 0;
		k= name.compareToIgnoreCase(d.name);
		l= speciality.compareToIgnoreCase(d.speciality);
		
		
		if (oVF == d.oVF)
			m = 0;

		if ((k+l+m) == 0)
			b= true;
		else 
			b = false;
			return b;
		}
	
	/*
	 * name: display
	 * input: void
	 * output: 
	 * 
	 */
	public void display() {
		super.display(); 
		
		setIncome(counter);
		System.out.printf("%-20s %s\n", "Specialty", speciality); 
		System.out.printf("%-20s $%.2f\n", "Office Visit Fee", oVF); 
		System.out.printf("%-20s $%.2f\n", "Total Income", income); 
		System.out.println("------------------------------------");
	}
}
