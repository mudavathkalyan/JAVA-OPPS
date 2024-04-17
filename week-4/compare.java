/* 1. Write an application that uses String method compareTo to compare two strings
defined by the user.
*/
import java.util.*;
class compare
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string1:");
		String str1=sc.nextLine();
		System.out.print("Enter string2:");
		String str2=sc.nextLine();
		System.out.println("The result  using compareTo="+str1.compareTo(str2));
		
	}
}
