/*. Write an application that declares 5 integers, determines and prints the largest
and smallest in the group.*/
import java.util.*;
public class min_max
{
	public static void main(String[] kalyan)
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3,n4,n5,min=0,max=0;
		System.out.println("Enter any five Numbers to find min & max:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		n4=sc.nextInt();
		n5=sc.nextInt();
		if(n1==n2 && n2==n3 && n3==n4 && n4==n5)
		{
		 System.out.println("The Numbers equal to ="+n1);
		 return;
		}
		else if(n1>=n2 && n1>=n3 && n1>=n4 && n1>=n5)
		{
			max=n1;
			min=n2;
			 if(min>n3)
				min=n3;
			 if(min>n4)
				min=n4;
			 if(min>n5)
				min=n5;
		}
		else if(n2>=n1 && n2>=n3 && n2>=n4 && n2>=n5)
		{
			max=n2;
			min=n1;
			 if(min>n3)
				min=n3;
			 if(min>n4)
				min=n4;
			 if(min>n5)
				min=n5;
		}
		else if(n3>=n1 && n3>=n2 && n3>=n4 && n3>=n5)
		{
			max=n3;
			min=n1;
			if(min>n2)
				min=n2;
			 if(min>n4)
				min=n4;
			 if(min>n5)
				min=n5;
		}
		else if(n4>=n1 && n4>=n2 && n4>=n3 && n4>=n5)
		{
			max=n4;
			min=n1;
			if(min>n3)
				min=n3;
			if(min>n2)
				min=n2;
			 if(min>n5)
				min=n5;
		}
		else if(n5>=n1 && n5>=n2 && n5>=n4 && n5>=n3)
		{
			max=n5;
			min=n1;
			if(min>n2)
				min=n2;
			 if(min>n3)
				min=n3;
			 if(min>n4)
				min=n4;
		}
		System.out.println("Largest="+max);
		System.out.println("Smallest="+min);
	}
}
