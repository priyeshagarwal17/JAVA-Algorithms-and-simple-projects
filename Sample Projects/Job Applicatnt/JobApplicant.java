package OOPS_CLASS;

public class JobApplicant {
	//data field variables
	
private String name, phonenumber;
private boolean wP,sS,dB,gP;
	//constuructor
public JobApplicant(String name, String phonenumber, boolean wP, boolean sS, boolean dB, boolean gP)
{
this.dB=dB;
this.wP=wP;
this.sS=sS;
this.gP=gP;
this.name=name;
this.phonenumber=phonenumber;
}
	//methods	

/*
 * name: isQualified
 * input:
 * output: boolean
 */

public boolean isQualified() 
{
int count=0;
if (wP)
	count++;
if (sS)
	count++;
if (dB)
	count++;
if (gP)
	count++;

if (count>=3)
	return true;
else 
	return false;
}
/*
 * name: yesNo
 * input: Boolean
 * output: void
 */


public String  yesNo(boolean b)

{
	if (b)
		return "Yes";
	else 
		return "No";
}

/*
 * name: display
 * input: 
 * output: void
 */


public void display()
{
	
System.out.println("-----------------------------------");	
System.out.printf("%-20s %s\n","Name",name);
System.out.printf("%-20s %s\n","Phone Number",phonenumber);

System.out.printf("%-20s %s\n","Knows Word Procession",yesNo(wP));
System.out.printf("%-20s %s\n","Knows Databases",yesNo(dB));
System.out.printf("%-20s %s\n","Knows Spreadsheets",yesNo(sS));
System.out.printf("%-20s %s\n","Knows Graphics",yesNo(gP));
System.out.printf("%-20s %s\n","Qualified",yesNo(isQualified()));



}


}
