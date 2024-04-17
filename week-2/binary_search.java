//binary search..
import java.util.*;
public class binary_search
{
	public static void main(String...args)
	{
	 Scanner sc=new Scanner (System.in);
	 System.out.println("Enter the array size:");
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 int t=0;
	 System.out.println("Enter the array elements:");
	 for(int i=0;i<n;i++)
	 {
	  a[i]=sc.nextInt();
	 }
	 sc.nextLine();//
	 int i,j,mid;
	 for(i=0;i<n;i++)
	 {
	  for(j=i+1;j<n;j++)
	  {
	    if(a[i]>a[j])
	    {
	   	t=a[i];
	   	a[i]=a[j];
	   	a[j]=t;
	     }
	  }
	 }
	 
	 //Arrays.sort(a);////
	 int low,high;
	 System.out.println("Enter the element to search:");
	 t=sc.nextInt();
	  low=0;
	  high=n-1;
	  while(low<=high)
	  {
	  	mid=(low+high)/2;
	  	if(a[mid]==t)
	  	{
	  		System.out.println("Element found at index:"+mid);
	  		return;
	  	}
	  	else if(t>a[mid])
	  	{
	  		low=mid+1;
	  	} 
	  	else 
	  		high=mid-1;
	   //else
	 }
	      System.out.println("Element not found:");
	 
	}
}
