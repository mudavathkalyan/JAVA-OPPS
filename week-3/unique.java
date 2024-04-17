/*3. Write java program that inputs 5 numbers, each between 10 and 100 inclusive. As
each number is read display it only if it’s not a duplicate of any number already read
display the complete set of unique values input after the user enters each new value*/

import java.util.*;
class unique
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of inputs:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i=0,j;
		while(i<n)
		{
			System.out.print("\nEnter a number :Between 10 to 100:");
			int num=sc.nextInt();
			if(num>=10 && num<=100)
			{
				for(j=0;j<i;j++)
				{
					if(num==a[j])
					{
						System.out.println("Dublicate Found So No Reading:");
						break;
					}
				}
				if(j==i)
				{
					a[i++]=num;
					System.out.println("The number is unique and read:");
					for(int k=0;k<i;k++)
					{
						System.out.print( a[k]+" ");
					}	
				}
			}
		}
		System.out.println("\nThe Unique elements are:");
		for(int k:a)
		{
			System.out.print(k +" ");
		}
	}			
}
