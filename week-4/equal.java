/*2. Write an application that uses String method equals and equalsIgnoreCase to tests
any two string objects for equality.
*/
import java.util.*;
public class equal
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string1:");
		String str1=sc.next();
		System.out.print("Enter string1:");
		String str2=sc.next();
		System.out.println("By considering cases:");
		if(str1.equals(str2))
			System.out.println("Both Strings are equal:");
		else
			System.out.println("Both Strings are Not equal:");
		System.out.println("By Ignoring cases:");
		if(str1.equalsIgnoreCase(str2))
			System.out.println("Both Strings are equal :");
		else
			System.out.println("Both Strings are Not equal:");	
	}
}
	

