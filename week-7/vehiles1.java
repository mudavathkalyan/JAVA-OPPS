/*4. Create an Interface Vehicle with method getColor(),getNumber(), getConsumption()
calculate the fuel consumed, name and color for TwoWheeler and Four Wheeler By
implementing interface Vehicle.*/
import java.util.*;
interface vehicle
{
	String getColor();
	String getNumber();
	String getConsumption();
}
class TwoWheller implements vehicle
{
	
	String color,number,name,consumption;
	public String getColor()
	{
		return color;
	}
	public String getNumber()
	{
		return number;
	}
	public String getConsumption()
	{
		return consumption;
	}
}
class FourWheller implements vehicle
{
	
	String color,number,name,consumption;
	public String getColor()
	{
		return color;
	}
	public String getNumber()
	{
		return number;
	}
	public String getConsumption()
	{
		return consumption;
	}
}
class vehiles1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Two wheeler details :");
		System.out.print("Enter name,color,number,consumption type:");
		TwoWheller two =new TwoWheller();
		two.name=sc.nextLine();
		two.color=sc.nextLine();
		two.number=sc.nextLine();
		two.consumption=sc.nextLine();
		
		System.out.print("Four wheeler details :");
		System.out.print("Enter name,color,number,consumption type:");
		FourWheller four =new FourWheller();
		four.name=sc.nextLine();
		four.color=sc.nextLine();
		four.number=sc.nextLine();
		four.consumption=sc.nextLine();
		
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


































/*
4. Create an Interface Vehicle with method getColor(),getNumber(), getConsumption()
calculate the fuel consumed, name and color for TwoWheeler and Four Wheeler By
implementing interface Vehicle.

import java.util.*;

interface vehicle
{	
	String getColor();
	String getNumber();
	String getConsumption();
}
class TwoWheelers implements vehicle
{	
	String color,num,con;
	void set(String color,String num,String con)
	{	
		this.color=color;
		this.num=num;
		this.con=con;
	}
	public String getColor()
	{
		return color;
	}
	public String getNumber()
	{
		return num;	
	}
	public String getConsumption()
	{
		return con;
	}
}

class FourWheelers implements vehicle
{
	String color,num,con;
	void set(String color,String num,String con)
	{	
		this.color=color;
		this.num=num;
		this.con=con;
	}
	public String getColor()
	{
		return color;
	}
	public String getNumber()
	{
		return num;	
	}
	public String getConsumption()
	{
		return con;
	}
}
class vehicles1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		TwoWheelers tw=new TwoWheelers();
		FourWheelers fw=new FourWheelers();

		System.out.print("Enter the color,Number & consumption of TwoWheeelers:");
		String c=sc.nextLine();
		String n=sc.nextLine();
		String con=sc.nextLine();
		tw.set(c,n,con);
		
		System.out.print("\nEnter the color,Number & consumption of FourWheeelers:");
		String c1=sc.nextLine();
		String n1=sc.nextLine();
		String con1=sc.nextLine();
		fw.set(c1,n1,con1);
		
		System.out.println("\nThe Details Of TwoWheelers");
		System.out.println("color:"+tw.getColor());
		System.out.println("Number:"+tw.getNumber());
		System.out.println("Consumption Type:"+tw.getConsumption());
		
		System.out.println("\nThe Details Of FourWheelers");
		System.out.println("color:"+fw.getColor());
		System.out.println("Number:"+fw.getNumber());
		System.out.println("Consumption Type:"+fw.getConsumption());
			
	}
}
*/
