/*4. Write a Calculator program : Include all calculator operations in as classes in a Package
“Calculator” and import in to main class. *///correct
import calculator.addition;
import calculator.substraction;
import calculator.multiplication;
import calculator.division;
import calculator.modulo;
import java.util.*;
public class code4
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        addition a=new addition();
        substraction s=new substraction();
        multiplication mu=new multiplication();
        division d=new division();
        modulo mo=new modulo();
        while(true)
        {
            System.out.print("Enter \n1->addition\n2->substration\n3->multiplication\n4->division\n5->modulo\n6->Exit..\n");
            
            double n1,n2;
            System.out.print("Enter your choice::");
            int choice=sc.nextInt();
            if(choice==6)
            {
            	System.exit(0);
            }
            else
            {
             	 	System.out.print("Enter first number:");
            		n1=sc.nextDouble();
            		System.out.print("Enter second number:");
            		n2=sc.nextDouble();
            switch(choice)
            {
                case 1:System.out.println("Sum="+a.add(n1,n2));
                    break;
                case 2:System.out.println("Sub="+s.sub(n1,n2));
                    break;
                case 3:System.out.println("multi="+mu.mult(n1,n2));
                    break;
                case 4:System.out.println("divi="+d.div(n1,n2));
                    break;
                case 5:System.out.println("mod="+mo.mod(n1,n2));
                    break;
                default: System.out.println("Invalid entry");
            }
            }
        }
        
    }
}
