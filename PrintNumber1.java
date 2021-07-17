/*5. Create a class named 'PrintNumber' to print various numbers of different datatypes by creating 
different functions with the same name 'printn' having a parameter for each datatype.
*/

class Printnumber
{

	Printnumber(int a, int b)
        {
	  System.out.println("Sum of 2 integer is "+(a+b));
	}
	Printnumber(double a, double b)
        {
	  System.out.println("Sum of 2 double is "+(a+b));
	}

	Printnumber(String a, String b)
        {
	  System.out.println("Sum of 2 String is "+(a+b));
	}

}
public class PrintNumber1
{
	public static void main(String args[])
       {

	 Printnumber p1 = new Printnumber(4,8);
	 Printnumber p2 = new Printnumber(12.5,10.5);
	 Printnumber p3 = new Printnumber("Tom ","Jerry");
	}

}