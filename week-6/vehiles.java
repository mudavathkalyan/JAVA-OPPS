
/*5. Write an application to create a super class Vehicle with information vehicle
number,insurance number,color and methods getConsumption() displayConsumption().
Derive the sub-classes TwoWheeler and FourWheeler with method maintenance() and
average() to print the maintenance And average of vehicle. */

import java.util.*;
class parent
{
	String vno,ino,color,con;
	void setDetails(String vno,String ino,String color,String con)
	{
		this.color=color;
		this.ino=ino;
		this.vno=vno;
		this.con=con;
	}
	String getConsumption()
	{
		return con;
	}
}
class  TwoWheeler extends parent
{
	void maintenance()
	{
		System.out.println("maintenance of two weller:");
	}	
	void average()
	{
		System.out.println("average of two wheller:");
	}
}
class FourWheeler extends parent
{
	void maintenance()
	{
		System.out.println("maintenance of four weller:");
	}	
	void average()
	{
		System.out.println("average of four wheller:");
	}
}
class vehiles
{	
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			TwoWheeler two =new TwoWheeler();
			System.out.print("Enter details of two-wheelers like:VicleNo,InsurenceNo,color,consumption::");	
			two.setDetails(sc.nextLine(),sc.nextLine(),sc.nextLine(), sc.nextLine());
			FourWheeler four=new FourWheeler();
			
			System.out.print("Enter details Fout whellers like:VicleNo,InsurenceNo,color,consumption::");
			four.setDetails(sc.nextLine(),sc.nextLine(),sc.nextLine(), sc.nextLine());
			System.out.println("Details of two wheelers are::");
			System.out.println("Vno="+two.vno);
			System.out.println("color="+two.color);
			two.maintenance();
			System.out.println("consumption="+two.getConsumption());
			two.average();
			System.out.println("Details of four wheelers are::");
			System.out.println("Vno="+four.vno);
			System.out.println("color="+four.color);
			four.maintenance();
			System.out.println("consumption="+four.getConsumption());
			four.average();			
		}	
}
