/*4. Create a class named 'Programming'. While creating an object of the class, 
if nothing is passed to it, then the message "I love programming languages" should be printed. 
If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
For example, while creating the object if we pass "cpp", then "I love cpp" should be printed.
*/

class Programme
{
   Programme()
   {
     System.out.println("I love Programming Languages");
   }	
    Programme(String x)
    {
	System.out.println("I love "+x);
    }

}
public class Programming1
{

	public static void main(String args[]){
	Programme p = new Programme();
	Programme p1= new Programme("CPP");
}
}