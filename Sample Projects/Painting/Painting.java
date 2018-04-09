package OOPS_CLASS;

public class Painting {
private String title, artist, medium;
private double price, comission;
//constructor
/*
 * name: Painting
 * input : String,String,String,double
 * output: 
 * 
 */
public Painting(String title, String artist,String medium,double price)
{
this.title=title;
this.artist=artist;
this.medium=medium;
this.price=price;
this.comission=computeComission();
}

//methods

/*
 * name= getPrice
 * input= -
 * output= double 
 * 
 */
public double getPrice()
{
return price;	
}
/*
 * name = setPrice
 * input= double
 * output= void
 */
public void setPrice(double newPrice)
{	
price= newPrice;
comission=computeComission();
}

/*
 * name: computeComission
 * input: -
 * output: double
 * 
 */

 public double computeComission()
 {
	 comission= 0.2*price;
	 return comission;
 }

 
 
 /*
  * name: display
  * input: 
  * output: 
  * 
  */
 
 public void display()
 
 {
	 System.out.println("Painting info");
	 System.out.printf("%-20s %s \n","Title",title);
	 System.out.printf("%-20s %s \n","Artist",artist); 
	 System.out.printf("%-20s %s \n","Medium",medium);
	 System.out.printf("%-20s $%.2f \n","Price",price);
	 System.out.printf("%-20s $%.2f \n","Comission",comission);
	 System.out.println("----------------------------------------------------------------------");
 }
 
 
 
	
	
	
	
}
