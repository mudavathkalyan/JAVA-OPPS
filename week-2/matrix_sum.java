//Add matrix
import java.util.*;
public class matrix_sum
{
	public static void main(String[] args)
	{
	 	Scanner sc=new Scanner(System.in);
	 	int r1,c1,r2,c2;
	 	System.out.print("Enter the rows & columns of matrix A");
	 	r1=sc.nextInt();
	 	c1=sc.nextInt();
	 	System.out.print("Enter the rows & columns of matrix B");
	 	r2=sc.nextInt();
	 	c2=sc.nextInt();
	 	if(r1!=r2 || c1!=c2)
	 		System.out.println("Sum not possible");
	 	else
	 	{
	 	 int a[][]=new int[r1][c1];
	 	 int b[][]=new int[r2][c2];
	 	 int c[][]=new int[r1][c1];
	 	 System.out.println("Enter matrix A Elements:");
	 	 for(int i=0;i<r1;i++)
	 	 {
	 	   for(int j=0;j<c1;j++)
	 	   {
	 	    a[i][j]=sc.nextInt();
	 	   }
	 	  }
	 	 
	 	 System.out.println("Enter matrix B Elements:");
	 	 for(int i=0;i<r2;i++)
	 	 {
	 	   for(int j=0;j<c2;j++)
	 	   {
	 	    b[i][j]=sc.nextInt();
	 	   }
	 	  }
	 	  for(int i=0;i<r1;i++)
	 	 {
	 	   for(int j=0;j<c1;j++)
	 	   {
	 	     c[i][j]=a[i][j]+b[i][j];
	 	   }
	 	 }
	 	  System.out.println("sum of both matrices are:");
	 	 for(int i=0;i<r1;i++)
	 	 {
	 	   for(int j=0;j<c1;j++)
	 	   {
	 	    System.out.print(c[i][j]+" ");
	 	   }
	 	    System.out.println("");
	 	 }
	 	 
	 	}
	 	
	}
}
