/* 10. A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
We have to print the money deposited by him in a particular bank.
Create a class 'Bank' with a function 'getBalance' which returns 0. 
Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a function with the same 
name 'getBalance' which returns the amount deposited in that particular bank. 
Call the function 'getBalance' by the object of each of the three banks.
*/

class Bank
{
 int getBalance()
 {
  return 0; 
 }

}

class BankA extends Bank
{
 int getBalance(int balance)
 { 
  return balance; 
 }
}

class BankB extends Bank
{
 int getBalance(int balance)
 { 
  return balance; 
 }
}

class BankC extends Bank
{
 int getBalance(int balance) 
 { 
  return balance;
 }

}

public class Bank1
{
  public static void main(String args[]) 
  {
   BankA x = new BankA();
   BankB y = new BankB();
   BankC z = new BankC();

   System.out.println(" " +x.getBalance(1000));
   System.out.println(" " +y.getBalance(1500));
   System.out.println(" " +z.getBalance(2000));
  }
} 
