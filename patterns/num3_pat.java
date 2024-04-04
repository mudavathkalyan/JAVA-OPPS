import java.util.*;
public class num3_pat
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the a number :");
		int n=sc.nextInt();
		  int x=1;
		  int y=n-1;
		for(int i=1;i<=(n*2)-1;i++)
		{
		  if(i<=n)
		  System.out.print(x++);
		  else
		  System.out.print(y--);
		}
		System.out.println("");
		n--;
		for(int i=1;i<=n;i++)
		{
		int t=1;
		 for(int j=i;j<=n;j++)
		   System.out.print(t++);
		 for(int j=1;j<=(2*i)-1;j++)
		 {
			System.out.print(" ");
		}
		int k=t-1;
		for(int j=i;j<=n;j++)
		{
			System.out.print(k--);
		}
		 System.out.println("");
		}
	 }
}
