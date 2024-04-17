/*1. Write a Java program to find Area and circumference different shapes using polymorphism
concept */
import java.util.*;
class shapes
{
    double length,breadth;
    double radius;
     shapes(double l,double b)
    {
        length=l;
        breadth=b;
        System.out.println("Area of rectangle:"+length*breadth);
        System.out.println("Perimeter of rectangle:"+2*(length+breadth));
    }
     shapes(double r)
    {
    radius=r;
    System.out.printf("Area of Circle:%.2f",Math.PI *radius*radius);
    System.out.printf("\nCircumference of circle:%.2f",2*Math.PI*radius);
    }
}
class area
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lenght and Breadth of the Rectangle:");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.print("Enter the Radius of the Circle:");
        double r=sc.nextDouble();
        shapes s1=new shapes(l,b);
        shapes s2=new shapes(r);


    }
}
