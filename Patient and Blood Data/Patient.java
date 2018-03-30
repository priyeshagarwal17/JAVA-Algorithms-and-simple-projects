package OOPS_CLASS;
import java.util.Random;
public class Patient {
 private int id,age;
 private BloodData bt;
 private Random randGen= new Random();
//Constructor
 /*
  * name patient
  * input
  * output
  * 
  */
  public Patient()
 {	 
	 id=randGen.nextInt(90000)+10000;
	 age=20;
	 bt= new BloodData();	 
 }
	
  /*
   * name patient
   * input
   * output
   * 
   */
  
 public Patient(int age, String bt ,char rhFactor, int id)
 {
	 randGen.setSeed(1);
	 this.age=age;
	 this.bt= new BloodData(bt,rhFactor);
	 this.id=id;
}
 
 
 // methods
 
 /*
  * name: setBT
  * input: string, char
  * output: void
  * 
  */
 
 public void setBT(String BloodType, char rhFactor)
 {
	bt.setrhFactor(rhFactor);
	bt.setBloodType(BloodType); 
 }
 

 /*
  * name getbloodData
  * input -
  * output 
  * 
  */
 
public BloodData getBloodData()
{
	return this.bt;
}

 /*
  * name display
  * input -
  * output void
  * 
  */
 

public void display()
{

System.out.printf("%-15s %d \n","id :",id);
System.out.printf("%-15s %d \n","Age :",age);


bt.display();


}

 
}