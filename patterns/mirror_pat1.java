import java.util.*;
public class mirror_pat1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the a number :");
		int n=sc.nextInt();
		  int a;
		  int b;
		  int min=0;
		 for(int i=1;i<=(n*2)-1;i++)
		 {
		  for(int j=1;j<=(n*2)-1;j++)
		  {
		   a=i;
		   if(i>n)
		   	  a=2*n-i;
		   b=j;
		   if(j>n)
		   	b=2*n-j;
		   if(a>b)
		   	min=b;
		   else 
		   	min=a;
		   System.out.print(min);		  
		  }
		   System.out.println("");
		 }
	 }
}
