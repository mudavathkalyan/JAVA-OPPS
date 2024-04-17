/*. Write java program that inputs 5 numbers, each between 10 and 100 inclusive. As
each number is read display it only if it’s not a duplicate of any number already read
display the complete set of unique values input after the user enters each new value.
*/

import java.util.*;
public class product
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int flag=0;
		int j;
		while(flag<n)
		{
			System.out.print("Enter a number between 10 && 100:");
			int num=sc.nextInt();
			if(num>=10 && num<=100)
			{
				for(j=0;j<flag;j++)
				{
					if(a[j]==num)
					{
						System.out.println("Duplicate found: no reading:");
						break;
					}
				}
				if(flag==j)
				{
					a[flag++]=num;
					for(int i=0;i<flag;i++ )
						System.out.print(a[i]+" ");
				}
			}
		}
	}
}
