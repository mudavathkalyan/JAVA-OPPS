/* Write a java program to find factors of given number*/
import java.util.*;
public class factors
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number :");
		n=sc.nextInt();
		System.out.println("Factors are:");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			 System.out.println(i);
			}
		}
	}
}
