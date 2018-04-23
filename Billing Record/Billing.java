

 
public class Billing extends Patient{
	//data field variables

	Patient p1;
	Doctor d1;
	
	//constructor
	/*
	 * name: Billing
	 * input: String, int
	 * output: 
	 * 
	 */
	public Billing(String n,int id)
	{
		super(n,id);
		
		
		
	}
	//methods	
	
	//set
	
	/*
	 * name: setPatientDetails
	 * input: String, int
	 * output: void
	 * 
	 */
	public void setPatientDetails(String n, int id2)
	{
	p1.name=n;
	p1.id=id2;
	}
	
	/*
	 * name: setDoctorDetails
	 * input: String, double, String
	 * output: void
	 * 
	 */
	public void setDoctorDetails(String specialty, double ovf2,String n1)
	{
	d1.name=n1;
	d1.speciality=specialty;
	d1.oVF= ovf2;
	}
	
	/*
	 * name: setDrIncome
	 * input: int
	 * output: void
	 * 
	 */
	public void setDrIncome(int counter)
	{
		d1.income=d1.oVF*counter;
	}
	//get
	
	/*
	 * name: getPatientDetails
	 * input: 
	 * output: Patient
	 * 
	 */
	public Patient getPatientDetails()
	{	
		return p1;
	}
	
	/*
	 * name: getDoctorDetails
	 * input: 
	 * output: Doctor
	 * 
	 */
	public Doctor getDoctorDetails()
	{	
		return d1;
	}
	
	
	/*
	 * name: equals
	 * input: Billing
	 * output: boolean
	 * 
	 */
	public boolean equals(Billing b)
	{
		int k=1,m=1;
	
		if (b.p1==p1)
			k= 0;
		if (b.d1==d1)
			m= 0;
		
		if (m+k==0)
			return true;
		else 
			return false;
	}
	public void display()
	{
		System.out.println("");
		
		
	}
	
}
