package OOPS_CLASS;

public class BloodData {
	
	//constructor
 private String bloodType;
 private char rhFactor;
 
 public BloodData()
{
	 bloodType="O";
	 rhFactor='+';
}
 
 public BloodData(String bloodType, char rhFactor)
 {
	this.bloodType=bloodType;
	this.rhFactor=rhFactor;
 }
 
 //methods
 /*
  * name: setBloodType
  * input: string
  * output: void
  * 
  */
 
 public void setBloodType(String bloodType)
 {
	 this.bloodType = bloodType;
 }
 
 /*
  * name: setehFactor
  * input: char
  * output: void
  * 
  */
 
 public void setrhFactor(char rhFactor)
 {
	 this.rhFactor = rhFactor;
 }
 
 
 
 
 public void display()
 
{	 


System.out.println("description of Blood Data");
System.out.printf("%-20s %s \n","Blood Type :",bloodType);
System.out.printf("%-20s %s \n","RH Factor :",rhFactor);
System.out.println();
System.out.println("================================");	
}
 
 
}
