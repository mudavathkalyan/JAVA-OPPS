//
import java.util.*;
public class matrix_mult
{
	public static void main(String[] args)
	{
	 	Scanner sc=new Scanner (System.in);
	 	int r1,c1,r2,c2;
	 	System.out.print("Enter the rows & columns of matrix A:");
	 	r1=sc.nextInt();
	 	c1=sc.nextInt();
	 	System.out.print("Enter the rows & columns of matrix B:");
	 	r2=sc.nextInt();
	 	c2=sc.nextInt();
	 	if(c1!=r2)//r1!=c2 
	 		System.out.println("Multiplication not possible:");
	 	else
	 	{
	 		int a[][]=new int[r1][c1];
	 		int b[][]=new int[r2][c2];
	 		int c[][]=new int[r1][c2];
	 		System.out.println("Enter the matrix A elements:");
	 		for(int i=0;i<r1;i++)
	 		{
	 		  for(int j=0;j<c1;j++)
	 		  {
	 		     a[i][j]=sc.nextInt();
	 		  }
	 		}
	 		System.out.println("Enter the matrix B elements:");
	 		for(int i=0;i<r2;i++)
	 		{
	 		  for(int j=0;j<c2;j++)
	 		  {
	 		     b[i][j]=sc.nextInt();
	 		  }
	 		}
	 		//System.out.println("Enter the matrix A elements:");
	 		for(int i=0;i<r1;i++)
	 		{
	 		  for(int j=0;j<c2;j++)
	 		  {
	 		    c[i][j]=0;
	 		    for(int k=0;k<c1;k++)//
	 		    {
	 		     c[i][j]=c[i][j]+a[i][k]*b[k][j];
	 		    } 
	 		  }
	 		}
	 		System.out.println("matrix multiplication is:");
	 		for(int i=0;i<r1;i++)
	 		{
	 		  for(int j=0;j<c2;j++)
	 		  {
	 		     System.out.print(c[i][j]+" ");
	 		  }
	 		  System.out.println("");
	 		}
	 	}
	}
}
