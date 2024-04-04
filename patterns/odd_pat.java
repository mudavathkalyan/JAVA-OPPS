import java.util.*;
public class odd_pat
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the a number :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		      int t=1;
			for(int j=1;j<=i;j++)
			{
			 t=(2*j)-1;
			 System.out.print(t);
			}
		   System.out.println("");
		}	
	}
}
