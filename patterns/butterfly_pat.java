//butterfly_patttern
import java.util.*;
public class butterfly_pat
{
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner (System.in);
	  System.out.println("Enter the n:");
	  int n=sc.nextInt();
	  for(int i=1;i<=n;i++)
	  {
	   for(int j=1;j<=i;j++)
	   {
	    System.out.print("*");
	   }
	    int t=2*(n-i);
	    for(int j=1 ;j<=t;j++)
	    {
	     System.out.print(" ");
	    }
	    for(int j=1;j<=i;j++)
	    {
	     System.out.print("*");
	    }
	     System.out.println("");
	   }
	   //
	   
	   for(int i=n;i>=1;i--)
	   {
	    for(int j=1;j<=i;j++)
	    {
	     System.out.print("*");
	    }
	    int t=2*(n-i);
	    for(int j=1;j<=t;j++)
	    {
	     System.out.print(" ");
	    }
	    for(int j=1;j<=i;j++)
	    {
	      System.out.print("*");
	    }
	    System.out.println("");
	   }
	   
	 }  	
}
