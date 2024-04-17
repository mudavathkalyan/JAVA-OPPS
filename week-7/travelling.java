/*5. Create an Interface Fare with method getAmount() to get the amount paid for fare
of travelling. Calculate the fare paid by bus and train implementing interface Fare.*/

import java.util.*;
interface fare
{
	double getAmount();
}
class bus implements fare
{
	Double noKm,rate;
	void setDetails(double d1,double d2)
	{
		noKm=d1;
		rate=d2;
	}
	public double getAmount()
	{
		return noKm*rate;
	}

}
class train implements fare
{	
	Double noKm,rate;
	void setDetails(double d1,double d2)
	{
		noKm=d1;
		rate=d2;
	}
	public double getAmount()
	{
		return noKm*rate;
	}
	
}
public class travelling
{
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		bus b=new bus();
		train t=new train();
		System.out.print("For Bus:");
		System.out.print(" Enter No of Km and rate for km:");
		b.setDetails(sc.nextDouble(),sc.nextDouble());
		System.out.print("For Train::Enter No of Km and rate for km:");
		t.setDetails(sc.nextDouble(),sc.nextDouble());
		System.out.println("The fare paid by bus:"+b.getAmount());	
		System.out.println("The fare paid by train:"+t.getAmount());	
	}
}
