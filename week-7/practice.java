/*4. Create an Interface Vehicle with method getColor(),getNumber(), getConsumption()
calculate the fuel consumed, name and color for TwoWheeler and Four Wheeler By
implementing interface Vehicle.*/
import java.util.*;
interface vehicle
{
	String getColor();
	String getNumber();
	double getConsumption();
}
class TwoWheller implements vehicle
{
	
	String color,number,name;
	double consumption;
	public String getColor()
	{
		return color;
	}
	public String getNumber()
	{
		return number;
	}
	public double getConsumption()
	{
		return consumption;
	}
}
class FourWheller implements vehicle
{
	
	String color,number,name;
	double consumption;
	public String getColor()
	{
		return color;
	}
	public String getNumber()
	{
		return number;
	}
	public double getConsumption()
	{
		return consumption;
	}
}
class practice
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter details of Two wheelers ->name,color,number,consumption:");
		TwoWheller two =new TwoWheller();
		two.name=sc.nextLine();
		two.color=sc.nextLine();
		two.number=sc.nextLine();
		two.consumption=sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Enter details of Four wheelers ->name,color,number,consumption:");
		FourWheller four =new FourWheller();
		four.name=sc.nextLine();
		four.color=sc.nextLine();
		four.number=sc.nextLine();
		four.consumption=sc.nextDouble();
		
		System.out.println("The details of Two whellers::");
		System.out.println("Fule consumed:"+two.getConsumption());
		System.out.println("Name:"+two.name);
		System.out.println("color:"+two.color);
		
		System.out.println("The details of Four whellers::");
		System.out.println("Fule consumed:"+four.getConsumption());
		System.out.println("Name:"+four.name);
		System.out.println("color:"+four.color);	
	}
	
}
