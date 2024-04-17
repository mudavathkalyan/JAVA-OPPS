import java.util.*;
import duplicate.sum;
import duplicate.sub;
import duplicate.mul;
class practice
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		sum s=new sum();
		while(true)
		{
			System.out.println("Enter n1 and n2:");
			double n1=sc.nextDouble();
			double n2=sc.nextDouble();
			System.out.println("Enter 1->sum->2sub->3mul4->exit");
			int c=sc.nextInt();
			switch(c)
			{
				case 1:System.out.println(s.add(n1,n2));
				break;
			}
			
			
		}
		
	}
	
}
