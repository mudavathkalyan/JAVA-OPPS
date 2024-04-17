/*4. Write a java program : rolling a pair of dices 10 times [ each attempt should be delayed
by 10000 ms ] and count number Successful attempts.
successful attempt : If the pair of Dice results in same values.*/

import java.util.*;
//import java.util.Random;
public class dice
{
	public static void main(String args[]) throws Exception //InterruptedException
	{
		//Scanner sc=new Scanner(System.in);
		
		Random r=new Random();
		int dice1,dice2;
		int count=0;
		for(int i=0;i<10;i++)
		{
			dice1=r.nextInt(1,6);
			dice2=r.nextInt(1,6);
			if(dice1==dice2)
			{
				System.out.println("Prossing: Successful attempt:");
				count++;
			}
			else if(dice1!=dice2)
			{
			System.out.println("Prossing: Unsucessful attempt:");
			}
			Thread.sleep(1000);//**
		}
		System.out.println("The successful attempts are:"+count);
		
		
	}
}

