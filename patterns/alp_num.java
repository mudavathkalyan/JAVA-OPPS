import java.util.*;
public class alp_num
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the a number :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{ 
		if(i%2==0)
		{
		 for(int j=1;j<=i;j++)
		  {   
			 System.out.printf("%2c",j+64);//
		  }
		 }
		 else
		 {
		  for(int j=1;j<=i;j++)
		  {
		   System.out.format("%2d",j);
		  }
		  }
		   System.out.println("");
		}
		
		
	}
}
