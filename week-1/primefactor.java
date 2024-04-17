/* Write a java program to find prime factors of given number*/
import java.util.*;
public class primefactor
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n,c;
		n=sc.nextInt();
		System.out.println("The prime factors are:");
		for(int i=1;i<=n;i++)
		{
		  c=0;
		  for(int j=1;j<=i;j++)
		  {
			if(i%j==0)
			{
			 c++;
			}
		  }
		   if(c==2 && (n%i==0))
		   {
			 System.out.println(i);
		   }	
	    }
	}			
}
