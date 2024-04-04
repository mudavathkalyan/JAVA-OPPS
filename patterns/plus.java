import java.util.*;
public class plus
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the a number :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		 for(int j=1;j<=n;j++)
		  {   
		    int t=(n/2)+1;
		  	if(i==t || j==t)
			 System.out.print("*");
			 else
			    System.out.print(" ");
		  }
		   System.out.println("");
		}
	}
}
