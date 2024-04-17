/*4. Derive sub-classes of ContractEmployee namely HourlyEmployee & WeeklyEmployee
with information number of hours & wages per hour, number of weeks & wages per
week respectively & method calculateWages() to calculate their monthly salary.
Also override getDesig () method depending on the type of contract employee. *///--correct

import java.util.Scanner;
class ContractEmployee
{
    String desi;
    void setDesig(String desi)
    {
        this.desi=desi;
    }
    String getDesig()
    {
        return desi;
    }
}
class WeeklyEmployee extends ContractEmployee
{
    
    int noOfWeeks,WagesPerWeek;
    void details(int noOfWeeks,int WagesPerWeek)
    {
        this.noOfWeeks=noOfWeeks;
        this.WagesPerWeek=WagesPerWeek;
    }
    void calculateWages()
    {
        double salary=noOfWeeks*WagesPerWeek*30;
        System.out.println("SALARY:"+salary);
    }
}
class HourlyEmployee extends ContractEmployee
{
    int noOfHour,WagesPerHour;
    void details(int noOfHour,int WagesPerHour)
    {
        this.noOfHour=noOfHour;
        this.WagesPerHour=WagesPerHour;
    }
    void calculateWages()
    {
        double salary=noOfHour*WagesPerHour*30;
        System.out.println("SALARY:"+salary);
    }
}
class hourly_emp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HourlyEmployee h=new HourlyEmployee();
        WeeklyEmployee we=new WeeklyEmployee();
        
        System.out.print("Enter designation of Hourly employee:");
        h.setDesig(sc.nextLine());
        System.out.print("Enter noOfHours and WagesPerHour:");
        h.details(sc.nextInt(),sc.nextInt());
        sc.nextLine();
        System.out.print("Enter designation of weekly employee:");
        we.setDesig(sc.nextLine());

        System.out.print("Enter noOfWeeks and WagesPerWeek:");
        we.details(sc.nextInt(),sc.nextInt());

        System.out.println("The Designation and salary of hourly employee:");
       System.out.println("DESIGNATION="+h.getDesig());
       h.calculateWages();
     
       System.out.println("The Designation and salary of weekly employee:");
      System.out.println("DESIGNATION="+we.getDesig());
      we.calculateWages();
    }
}



