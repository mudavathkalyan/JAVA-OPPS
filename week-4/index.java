/*3. Write an application that uses String method indexOf to determine the total
number of occurrences of any given alphabet in a defined text.
*/
import java.util.*;
public class index
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String str1=sc.nextLine();
		System.out.print("Enter a alphabet to find occurence:");
		char ch=sc.next().charAt(0);//
		int c=0;
		/*for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==ch)//str1.charAt(str1.indexOf(ch)==str1.charAt(i))
			  c++;
		}
		*/
		if(str1.indexOf(ch)==-1)
		{
			System.out.println("The occurence not found ");
		}
		else
		{
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(str1.indexOf(ch))==str1.charAt(i))
			 c++;
		}
		System.out.println("The occurence of "+ch+" is "+c);
		}	
	}
}
