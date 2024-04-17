/*2. Write an application that prompts the user for the radius of a circle and uses a
method called circleArea to calculate the area of the circle and uses a method
circlePerimeter to calculate the perimeter of the circle */
import java.util.*;
class get
{
    double radius;
    double circleArea(double r)
    {
        radius=r;
        return Math.PI * radius*radius;
    }

    double circlePerimeter(double r)
    {
        radius=r;
        return 2* Math.PI * radius;
    }

}
public class circle
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the radius of circle:");
            double r=sc.nextDouble();
            get g=new get();
            System.out.printf("The area of circle:%.2f",g.circleArea(r));
            System.out.printf("\nThe perimeter of circle:%.2f",g.circlePerimeter(r));            
        }
    
}
