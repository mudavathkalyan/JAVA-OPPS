// printing prime number within range
import java.util.*;
public class prime_range
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range :");
		int n1,n2,c;
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("The prime numbers are :");
		for(int i=n1;i<=n2;i++)
		{
		 c=0;
		 for(int j=1;j<=i;j++)
		 {
		  if(i%j==0)
		   c++;
		 }
		 if(c==2)
		 {
		  System.out.println(i);
		 }
		}
	}
}
