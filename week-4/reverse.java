/* 7. Write an application that uses String method charAt to reverse the string.*/

import java.util.*;
public class reverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a String:");
		String str1=sc.nextLine();
		String rev = "";
		for(int i=0;i<str1.length();i++)
		{
		rev = str1.charAt(i)+rev;
		}
		System.out.println(rev);
	}
}
