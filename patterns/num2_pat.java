import java.util.*;
public class num2_pat
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the a number :");
		int n=sc.nextInt();
		for(int i=1;i<=(n*2)-1;i++)
			System.out.print(i);
			System.out.println();
		n--;
		for(int i=1;i<=n;i++)
		{
		int t=1;
		 for(int j=i;j<=n;j++)
		   System.out.print(t++);
		 for(int j=1;j<=(2*i)-1;j++)
		 {
			System.out.print(" ");
			t++;
		}
		for(int j=i;j<=n;j++)
			System.out.print(t++);
		 System.out.println("");
		}
	 }
}
