/*
 * 2) Create an abstract class Employee with methods getAmount() which displays the
amount paid to employee. Reuse this class to calculate the amount to be paid to
WeeklyEmployeed and HourlyEmployee according to no. of hours and total hours
for HourlyEmployee and no. of weeks and total weeks for WeeklyEmployee.
 */

 import java.util.Scanner;

abstract class Employee 
{
    abstract double getAmount();
}
class WeeklyEmployee extends Employee
{
	double noOfWeeks,TotalNoOfWeeks,wages;
	double getAmount()
	{
		return noOfWeeks*TotalNoOfWeeks*wages;
	}
}
class HourlyEmployee extends Employee
{
	double noOfHours,TotalNoOfHours,wages;
	double getAmount()
	{
		return noOfHours*TotalNoOfHours*wages;
	}
}

 class employe1
 {
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter hours,total noOfHours & wages of HourlyEmployee : ");
         HourlyEmployee he = new HourlyEmployee();
         he.noOfHours=sc.nextDouble();
         he.TotalNoOfHours=sc.nextDouble();
         he.wages=sc.nextDouble();

         System.out.print("Enter weeks,noOfWeeks & wages of WeeklyEmployee : ");
         WeeklyEmployee we = new WeeklyEmployee();
         we.noOfWeeks=sc.nextDouble();
         we.TotalNoOfWeeks=sc.nextDouble();
         we.wages=sc.nextDouble();
        
         System.out.println("Amount of HourlyEmployee:"+he.getAmount());
         System.out.println("Amount of WeeklyEmployee:"+we.getAmount());
     }
 }

