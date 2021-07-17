/* 6. Create a class to print an integer and a character using two functions having the 
same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first function are of the form (int n, char c), 
then that of the second function will be of the form (char c, int n).
*/

class Parameter1
{
  Parameter1(int a, char b)
  {
    System.out.println("integer is : "+a +" "+"character is: "+b);
  }
  Parameter1(char b, int a)
  {
    System.out.println("integer is : "+a +" "+ "character is :"+b);
  }
}

public class Parameter
{
  public static void main(String [] args)
  {
    Parameter1 p1 = new Parameter1(23,'T');
    Parameter1 p2 = new Parameter1('V',25);
  }
}