package OOPS_CLASS;

public class Circle {
//data fields
	double radius; 
	final double pi=Math.PI;	// making it constant
	
	public Circle() {radius = 1;	} // return type is not there for a cunstructor
	//methods
	/*
	 * name: area
	 * input : 
	 * output : double
	 * description: calculating area of a circle 
	 */
	
	public Circle(double d)
	{radius=d;
	System.out.println("-------------------------------");}
	
	
	public double area()
	{		double ar;		ar=pi*radius*radius;		return ar;	}
	/*
	 * name : circumfence
	 * input : 
	 * output : double
	 */
	public double circumfence()
	{			return 2*pi*radius;		}
	/*
	 * name:display
	 * input: 
	 * output: Void
	 * description: display values
	 */
	public void display()
	{		System.out.println("radius is " +radius);		System.out.println("area is " +area());		System.out.println("circumfence is " +circumfence());
	}
	
	
	
	
	/*
	 * 
	 * name: getRadius
	 * input :
	 * output : double
	 * 
	 */
	public double getRadius() {return radius;}
	
	/*
	 * 
	 * name: setRadius
	 * input: double
	 * output : 
	 * 
	 */
	
	public void setRadius(double d) {radius=d;}
		
}
