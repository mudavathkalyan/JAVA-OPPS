//sort_names...
import java.util.*;
public class sort_names
{
 	public static void main(String[] args)
 	{
 	 Scanner sc=new Scanner(System.in);
 	 System.out.print("Enter the size of string :");
 	 int n=sc.nextInt();
 	 String str[]=new String[n];
 	 String temp;
 	    sc.nextLine();//to read space..
 	 System.out.print("Enter the names:");
 	 for(int i=0;i<n;i++)
 	 {
 	  str[i]=sc.nextLine();
 	 }
 	 
 	 for(int i=0;i<n;i++)
 	 {
 	  for(int j=i+1;j<n;j++)
 	  {
 	  if((str[i].compareTo(str[j]))>0)
 	  {
 	    temp=str[i];
 	    str[i]=str[j];
 	    str[j]=temp;
 	  }
 	  }
 	 }
 	 System.out.println("The sorted names are:");
 	 for(String arr:str)
 	 	System.out.print(arr+" ");
 	}
}
 	 //Arrays.sort(str);
