/*6. Write an application that finds the length of a given string */
import java.util.*;
public class length
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a string :");
		String str1=sc.nextLine();
		int count=0;
		for(char c:str1.toCharArray())//string->Array for each
		 count++;
		System.out.println("length="+count);
	}
}
