import java.util.*;
public class sno_pat
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the a number :");
		int n=sc.nextInt();
		int t=1;
		for(int i=1;i<=n;i++)
		{
		 for(int j=1;j<=i;j++)
		  {
		  System.out.print(t++);
		  }
		   System.out.println("");
		}
	}
}
