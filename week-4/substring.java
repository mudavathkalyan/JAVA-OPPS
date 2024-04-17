/*8. Write an application that finds the substring from any given string using substring
method and startsWith & endsWith methods */
import java.util.*;
public class substring
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a String:");
		String str1=sc.nextLine();
		System.out.println("subString:"+str1.substring(0,6));
		System.out.print("Enter a char:");
		String ch=sc.next();
		
		if(str1.startsWith(ch))
			System.out.println("Entered char is startsWith :"+ch);
		else
			System.out.println("not starts with :"+ch);
		if(str1.endsWith(ch))
				System.out.println("Entered char is endsWith :"+ch);
		else
			System.out.println("Not ends with :"+ch);
		
		
	}
}
