//check palindrome
import java.util.*;
public class palindrome
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int n,r=0,sum=0,temp;
  System.out.print("Enter a numner:");
  n=sc.nextInt();
  temp=n;
  while(n>0)
  {
  	 r=n%10;
  	 sum=sum*10+r;
  	 n=n/10;
  }
  if(sum==temp)
  	    System.out.println("Palindrome");
  	else
  		System.out.println(" Not a Palindrome");
  		
 }
}
