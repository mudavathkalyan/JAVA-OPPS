/* 7. Write an application that uses String method charAt to reverse the string.*/

import java.util.*;
public class reverse1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a String:");
		String str1=sc.nextLine();
		int n=str1.length();
		char ch[]=new char[n];
		int j=0;
		for(int i=n-1;i>=0;i--)
		{
		ch[j++]=str1.charAt(i);
		}
		String rev=new String(ch);
		System.out.println(rev);
	}
}
