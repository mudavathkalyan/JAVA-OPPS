import java.util.*;
public class diamond_pat2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the a number :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		 for(int j=1;j<=(n-i);j++)
		    System.out.print(" ");
		 for(int j=1;j<=(2*i)-1;j++)
		  System.out.print("*");
		   System.out.println("");
		}
		n--;
		  for(int i=n;i>=0;i--)
		  {
		   System.out.print(" ");
		   for(int j=1;j<=n-i;j++)
		    System.out.print(" ");
		   for(int j=1;j<=(2*i)-1;j++)
		    System.out.print("*");
		   System.out.println("");
		  }
	}
}