/* 1. Write a program to print the names of students by creating a Student class. 
If no name is passed while creating an object of the Student class, then the name should be "Unknown", 
otherwise the name should be equal to the String value passed while creating the object of the Student class.
*/

class student1
{
	student1()
        {
	  System.out.println("Unknown");
	}

	student1(String a)
        {
	  System.out.println(a);
        }
}	
public class student
{
	public static void main(String [] args)
        {

	student1 s1 = new student1();
	student1 s2 = new student1("Doremon");
	}
}
