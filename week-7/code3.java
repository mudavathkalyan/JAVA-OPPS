/*3. Create an Interface payable with method getAmount ().Calculate the amount to be
paid to Invoice and Employee by implementing Interface. */
/*3. Create an Interface payable with method getAmount ().Calculate the amount to be
paid to Invoice and Employee by implementing Interface. */

import java.util.*;
interface payable
{
	double getAmount(); 
}
class Invoice implements payable
{
	double amt;
	public double getAmount()
	{
		return amt;
	}
}
class Employee implements payable
{
	double amt;
	public double getAmount()
	{
		return amt;
	}
}
class code3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		Invoice in=new Invoice();
		System.out.print("Enter amount for invoice:");
		in.amt=sc.nextDouble();

		Employee e=new Employee();
		System.out.print("Enter amount for employee:");
		e.amt=sc.nextDouble();

		System.out.println("Invouce amount="+in.getAmount());
		System.out.println("Employee amount="+e.getAmount());
		

	}
}