/*6. Create an Interface StudentFee with method getAmount(),getFirstName(),getLastName(),
getAddress(), getContact(). Calculate the amount paid by the Hostler and NonHostler
student by implementing interface Student Fee*/


import java.util.*;
interface studentfee
{
	double getAmount();
	String getFirstName();
	String getLastName();
	String getAddress();
	int getcontact();
}
class hostlers implements studentfee
{
	double amt;
	String fname,lname,address;
	int con;
	public double getAmount()
	{
	return amt;
	}
	public String getFirstName()
	{
	 return fname;
	}
	public String getLastName()
	{
	return lname;
	}
	public String getAddress()
	{
	return address;
	}
	public int getcontact()
	{
	return con;
	}
}
class nonHostlers implements studentfee
{
	double amt;
	String fname,lname,address;
	int con;
	public double getAmount()
	{
	return amt;
	}
	public String getFirstName()
	{
	 return fname;
	}
	public String getLastName()
	{
	return lname;
	}
	public String getAddress()
	{
	return address;
	}
	public int getcontact()
	{
	return con;
	}
}
public class fee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		hostlers h=new hostlers();
		System.out.println("Enter the Hostlers Details:");
		System.out.print("Enter the FirstName:");
		h.fname=sc.nextLine();
		System.out.print("Enter the LastName:");
		h.lname=sc.nextLine();
		System.out.print("Enter the Address:");
		h.address=sc.nextLine();
		System.out.print("Enter the contactNo:");
		h.con=sc.nextInt();
		System.out.print("Enter the Amount:");
		h.amt=sc.nextDouble();
		sc.nextLine();
		nonHostlers h1=new nonHostlers();
		System.out.println("\nEnter the non-Hostlers Details:");
		System.out.print("Enter the FirstName:");
		h1.fname=sc.nextLine();
		System.out.print("Enter the LastName:");
		h1.lname=sc.nextLine();
		System.out.print("Enter the Address:");
		h1.address=sc.nextLine();
		System.out.print("Enter the contactNo:");
		h1.con=sc.nextInt();
		System.out.print("Enter the Amount:");
		h1.amt=sc.nextDouble();
		System.out.println("\nHostler Details::");
		System.out.println("Name:"+h.getFirstName()+" "+h.getLastName());
		System.out.println("Fee paid:"+h.getAmount());
		
		System.out.println("Non-Hostler Details::");
		System.out.println("Name:"+h1.getFirstName()+" "+h1.getLastName());
		System.out.println("Fee paid:"+h1.getAmount());
	}
}
