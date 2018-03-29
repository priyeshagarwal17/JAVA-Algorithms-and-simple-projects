
public class Complex {

	
//data field variables: 
	double realPart, imaginaryPart;
	
//constructor
	public Complex (double r, double i)
	{
	realPart = 	r;
	imaginaryPart = i;
	}
	
//Methods
	
/*
 * name		:	getRealPart()
 * input	:	
 * output 	: 	double
 */
	
public double getRealPart()
{	
return realPart;
}

/*
 * name		:	getImaginaryPart()
 * input	:	
 * output 	: 	double
 */
	
public double getImaginaryPart()
{	
return imaginaryPart;
}

/*
 * name		:	add
 * input	:	Complex
 * output 	: 	Complex
 */

public Complex add(Complex otherNumber)
{
Complex c= new Complex(0.0,0.0);
c.realPart= this.realPart+ otherNumber.realPart;
c.imaginaryPart = this.imaginaryPart +otherNumber.imaginaryPart;
return c;
}

/*
 * name		:	subtract
 * input	:	Complex
 * output 	: 	Complex
 */

public Complex subtract(Complex otherNumber)
{
Complex c= new Complex(0.0,0.0);
c.realPart= this.realPart - otherNumber.realPart;
c.imaginaryPart = this.imaginaryPart - otherNumber.imaginaryPart;
return c;
}

/*
 * name		:	multiply
 * input	:	Complex
 * output 	: 	Complex
 */

public Complex multiply(Complex otherNumber)
{
Complex c= new Complex(0.0,0.0);
c.realPart= this.realPart * otherNumber.realPart - (this.imaginaryPart * otherNumber.imaginaryPart);
c.imaginaryPart = this.realPart * otherNumber.imaginaryPart+this.imaginaryPart*otherNumber.realPart;
return c;
}



/*
 * name		:	divide
 * input	:	Complex
 * output 	: 	Complex
 */

public Complex divide(Complex otherNumber)
{
	
Complex Temp = new Complex (otherNumber.realPart,-otherNumber.imaginaryPart);
Complex Numerator= this.multiply(Temp);;
Complex Denominator= otherNumber.multiply(Temp);
double den = Denominator.realPart;
Complex c= new Complex(Numerator.realPart/den, Numerator.imaginaryPart/den );
return c;
}


/*
 * name		:	setRealPart
 * input	:	double
 * output 	: 	void
 */

public void setRealPart (double towhat)
{
this.realPart= towhat;	
}

/*
 * name		:	setImaginaryPart
 * input	:	double
 * output 	: 	void
 */

public void setImaginaryPart (double towhat)
{
this.imaginaryPart= towhat;	
}



/*
 * name		:	display
 * input	:	
 * output 	: 	String
 */

public String display()
{ 
	if (this.imaginaryPart == 0.0)
		return String.valueOf(this.realPart);
	else if (this.imaginaryPart > 0.0)
		return this.realPart+"+"+this.imaginaryPart+"i";
	else 
		return this.realPart+""+this.imaginaryPart+"i";
}


/*
 * name		:	toString
 * input	:	Complex, Complex
 * output 	: 	String
 */
public String toString(Complex c1, Complex c2)
{
System.out.println("("+c1.display()+")"+" + "+"("+c2.display()+")"+" = "+c1.add(c2).display());
System.out.println("("+c1.display()+")"+" - "+"("+c2.display()+")"+" = "+c1.subtract(c2).display());
System.out.println("("+c1.display()+")"+" * "+"("+c2.display()+")"+" = "+c1.multiply(c2).display());
System.out.println("("+c1.display()+")"+" / "+"("+c2.display()+")"+" = "+c1.divide(c2).display());
return null;
}
}



