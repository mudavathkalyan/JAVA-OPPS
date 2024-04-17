/*5.Write a Program using Threads for the following case study: Train Reservation system
To reserve a berth the following process need to be followed, at first check the number of
available berths with the requested berths, if the number of requested berths are less than
or equal to availabe berths then allot berth and print ticket or else display no berths are
available.
Assume that N persons are trying to reserve the berth, display their sequence of
reservation status along with the number of available berths.
Note : The person can print ticket only if berth is confirmed.*/
import java.util.*;
class train
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n brearths available::");
		train.breths=sc.nextInt();
		System.out.println("Enter the n persons:");
		int n=sc.nextInt();
		person p[]=new person[n+1];
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the no requested breaths of person:"+i);
			int req=sc.nextInt();
			person p[i]=new person(i,req);
		}
		for(int i=1;i<=n;i++)
		{
		p[i].start();
		}
			
		
	}
}


class person extends Thread
{
	static int breths;
	int person,requested;
	public void run()
	{	
		this.check();
	}
	person(int person,int requested)
	{
		this.person=person;
		this.requested=requested;
	}	
}
class train 
{
	int person,req;
	synchronized static void check(int person ,int req)
	{
		this.person=person;
		this.req=req;
		if(requested>person.breths)
		{
			System.out.println("no requested breaths for :"+person);
		}
		else
		{
			breths=breths-requested;
			System.out.println("breath reserved for persin:"+person);
			System.out.println("Ticked issued for person:"+person);
			System.out.println("Available breths are:"+person.breths);
		}
		
	}
}


