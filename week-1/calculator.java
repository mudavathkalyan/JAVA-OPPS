/* Write a Java program to implement calculator operations*/
import java.util.*;
public class calculator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double  a,b;
		double c=0;
		while(true)
		{
		System.out.print("Enter 1 for start calculations .else enter 0 for exit():");
		int stop=sc.nextInt();
		if(stop==0)
			System.exit(0);
		System.out.println("Enter  two operand:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Enter a operator:");
		char res=sc.next().charAt(0);
		
		switch(res)
		{
		 case '+':c=a+b;
		 	break;
		 case '-':c=a-b;
		 	break;
		 case '*':c=a*b;
		 	break;
		 case '/':c=a/b;
		 	break;
		 case '%':c=a%b;
		 	break;
		 default :System.out.println("Entered Invalid opreator");
		}
		System.out.println("result="+c);
	}
    }
}
