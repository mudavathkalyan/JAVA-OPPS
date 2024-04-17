// FINDING ROOTS OF A QUADRATIC EXPRESSION....
import java.lang.Math;
import java.util.*;

public class quadratic
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b & c:");
		int a,b,c,d;
		double r1,r2;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=((b*b)-4*a*c);// discreminent.
		 if(d>0)
		 {
		  System.out.println("The roots are real :");
		  r1=(-b+ Math.sqrt(d))/(2*a);
		  r2=(-b- Math.sqrt(d))/(2*a);
		  //System.out.println("root-1="+r1+" root-2="+r2);
		  System.out.printf("root-1=%.2f\nroot-2=%.2f",r1,r2);
		 }
		 else if(d<0)
		 {
		  System.out.println("The roots are imaginary :");
		  r1=(-b)/(2*a);
		  r2= (Math.sqrt(-d))/(2*a);
		 System.out.printf("root-1=%.2f+%.2fi\n",r1,r2);
		  System.out.format("root-2=%.2f-%.2fi\n",r1,r2);
		 }
		 else
		 {
		  System.out.print("The roots are equal :");
		  r1=(-b)/(2*a);
		  r2=r1;
		  System.out.print("\nroot1=root="+r1+"&"+r1);
		 }
	}
}
