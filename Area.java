/* 7. Create a class to print the area of a square and a rectangle. The class has two functions with the 
same name but different number of parameters. The function for printing the area of rectangle has two 
parameters which are its length and breadth respectively while the other function for printing the area 
of square has one parameter which is the side of the square.
*/

class area1
{
  area1(int a, double b)
  {
    System.out.println("Area of Rectangle:"+a*b);
  }
  area1(int s)
  {
    System.out.println("\n Area of Square:" +s*s);
  }
}

public class Area
{
  public static void main(String [] args)
  {
    area1 R1=new area1(12,5.2);
    area1 R2=new area1(8);
  }
}