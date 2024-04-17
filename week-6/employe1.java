/*3. Write an application to create a super class Employee with information first name
& last name and methods getFirstName(), getLastName() derive the sub-classes
ContractEmployee and RegularEmployee with the information about department,
designation & method displayFullName() , getDepartment(), getDesig() to print the
salary and to set department name & designation of the corresponding sub-class
objects respectively. */
import java.util.*;
class employee
{
    String FirstName,LastName;
    public String getFirstName() 
    {
        return FirstName;
    }
    public String getLastName()
    {
        return LastName;
    }
}
class ContractEmployee extends employee
{
    String department,designation;
    int salary;
    public int sal()
    {
        return salary;
    }
    public void fullname()
    {
        System.out.println(FirstName+" "+LastName);
    }
    String getDepartment()
    {
    	return department;
    }
    String getDesignation()
    {
    	return designation;
    }
}
class RegularEmployee extends employee
{
    String department,designation;
    int salary;
    public int sal()
    {
        return salary;
    }
    public void fullname()
    {
        System.out.println(FirstName+" "+LastName);
    }
    String getDepartment()
    {
    	return department;
    }
    String getDesignation()
    {
    	return designation;
    }
}
public class employe1
{
    public static void main(String[] args) 
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Details of the Contract emoloyee ::");

            System.out.println("Enter the details::");
            ContractEmployee c=new ContractEmployee();
            System.out.print("Enter firstName:");
            c.FirstName=sc.nextLine();
            System.out.print("Enter LastName:");
            c.LastName=sc.nextLine();
            System.out.print("Enter department:");
            c.department=sc.nextLine();
            System.out.print("Enter designation:");
            c.designation=sc.nextLine();
            System.out.print("Enter salary:");
            c.salary=sc.nextInt();
        
            System.out.println(" ");
            sc.nextLine();
            System.out.println("Enter the details of Regular employee::");
            RegularEmployee r=new RegularEmployee();
            System.out.print("Enter firstName:");
            r.FirstName=sc.nextLine();
            System.out.print("Enter LastName:");
            r.LastName=sc.nextLine();
            System.out.print("Enter department:");
            r.department=sc.nextLine();
            System.out.print("Enter designation:");
            r.designation=sc.nextLine();
            System.out.print("Enter salary:");
            r.salary=sc.nextInt();
            
            System.out.println("\n");
            System.out.println("The Details of Contract Employee are ::"); 
            c.fullname();
            System.out.println("Department name:"+c.getDepartment());
            System.out.println("Designation:"+c.getDesignation());
            System.out.println("Salary:"+c.sal());
            System.out.println("\n");

            System.out.println("The Details of Regular employee are ::");
            r.fullname();
            System.out.println("Department name:"+r.getDepartment());
            System.out.println("Designation:"+r.getDesignation());
            System.out.println("Salary:"+r.sal());
    }

} 
