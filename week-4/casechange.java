/* 9. Write an application that changes any given string with uppercase letters, displays
it, changes it back to lowercase letters and displays it.*/
import java.util.*;
public class casechange
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String str1=sc.nextLine();
		String str2=str1.toUpperCase();
		System.out.println("UpperCase="+str2);
		str2=str1.toLowerCase();
		System.out.println("LowerCase="+str2);
	}
	
}
