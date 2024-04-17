//Linear search
import java.util.*;
public class lin_search
{
	public static void main(String...args)
	{
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter the array size:");
	 	int n=sc.nextInt();
	 	int a[]=new int[n];
	 	System.out.println("Enter the array elements:");
	 	for(int i=0;i<n;i++)
	 	{
	 	 a[i]=sc.nextInt();
	 	}
	 	System.out.println("Enter a element to search:");
	 	int t=sc.nextInt();
	 	for(int i=0;i<n;i++)
	 	{
	 	 	if(t==a[i])
	 	 	{
	 	 		System.out.println("The element found at index="+i);
	 	 		return;
	 	 	}
	 	 	
	 	}
	 	System.out.println("The element not found");
	 	
	 	
	}
}
