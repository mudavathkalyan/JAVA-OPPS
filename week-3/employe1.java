/*1. Write a program to display details of the required employee based on his Id.
The details of employee includes, Emp_name, Emp_age, Emp_gender, Emp_designation,
Emp_salary, Emp_Address etc., */
import java.util.Scanner;
class employe
{
    String name,gender,address,designation;
    int age,salary,id;
    employe(int id,String name,String gender,String designation,String address,int age,int salary)
    {
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.designation=designation;
        this.address=address;
        this.age=age;
        this.salary=salary;
    }

}
public class employe1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of employees:");
        int n=sc.nextInt();
        employe emp[]=new employe[n];
        
        for(int i=0;i<n;i++)
        {
            System.out.print("\nEnter the id of "+(i+1)+" employe:");
            int id=sc.nextInt();
            System.out.print("Enter the age of "+(i+1)+" employe:");
            int age=sc.nextInt();
            System.out.print("Enter the salary of "+(i+1)+" employe:");
            int salary=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the name of "+(i+1)+" employe:");
            String name=sc.nextLine();
            System.out.print("Enter the gender of "+(i+1)+" employe:");
            String gender=sc.nextLine();
            System.out.print("Enter the designation of "+(i+1)+" employe:");
            String designation=sc.nextLine();
            System.out.print("Enter the address of "+(i+1)+" employe:");
            String address=sc.nextLine();
            emp[i]=new employe(id,name,gender,designation,address,age,salary);
        }
        System.out.println("enter the id to search and get details :");
        int searchid=sc.nextInt();
        boolean t=true;
        for(int i=0;i<n;i++)
        {
            if(searchid==emp[i].id)
            {
                System.out.println("Details found:");
                System.out.println("\nid:"+emp[i].id+"\nname:"+emp[i].name+"\ngender:"+emp[i].gender+
  "\ndesidnation:"+emp[i].designation+"\nage:"+emp[i].age+"\nsalary:"+emp[i].salary+"\naddress:"+emp[i].address);

                t=false;
                System.exit(0);
            }
        }
        if(t==true)
        {
            System.out.println("Id not match:::");
        }
    }    
}
