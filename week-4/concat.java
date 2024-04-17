/*4. Write an application that uses String method concat to concatenate two defined
strings.*/
import java.util.*;
public class concat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter String1:");
		String str1=sc.nextLine();
		System.out.print("Enter String1:");
		String str2=sc.nextLine();
		System.out.println("The concatenation of both strings :"+str1.concat(str2));	
	}
}
