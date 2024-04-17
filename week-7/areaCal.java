/*
 * 1. Create an abstract class Shape which calculate the area and volume of 2-d and 3-d
shapes with methods getArea() and getVolume(). Reuse this class to calculate the area
and volume of square ,circle ,cube and sphere.
 */
import java.util.*;
abstract class shape
{
     abstract double getArea();
     abstract double getVolume();
}

class square extends shape
{
    double sideOfSquare;
    double getArea()
    {
     return sideOfSquare*sideOfSquare;
    }
    double getVolume()
    {
        System.out.print("Square is 2D so no volume:");
        return 0;
    }
}
class circle extends shape
{
    double radiusOfCircle;
 
    double getArea()
    {
     return 2*Math.PI*radiusOfCircle*radiusOfCircle;
    }
    double getVolume()
    {
        System.out.print("Circle is 2D so no volume:");
        return 0;
    }
}
class cube extends shape
{
    double sideOfCube;
  
     double getArea()
    {
     return 6*sideOfCube*sideOfCube;
    }
    double getVolume()
    {
        return sideOfCube*sideOfCube*sideOfCube;
    }
}
class sphere extends shape
{
    double radiusOfSphere;
  
     double getArea()
    {
     return 4*Math.PI * radiusOfSphere * radiusOfSphere;
    }
    double getVolume()
    {
        return (4%3)*Math.PI*radiusOfSphere*radiusOfSphere*radiusOfSphere;
    }
}
public class areaCal 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        square sq=new square();
        circle ci=new circle();
        cube cb=new cube();
        sphere sp=new sphere();
        
        System.out.println("Enter the all dimensions of given shapes:");
        System.out.print("Enter the side of square:");
        sq.sideOfSquare=sc.nextDouble();
        System.out.print("Enter Radius of Circle:");
        ci.radiusOfCircle=sc.nextDouble();
        System.out.print("Enter side of cube:");
        cb.sideOfCube=sc.nextDouble();
        System.out.print("Enter radius of Sphere:");
        sp.radiusOfSphere=sc.nextDouble();

        System.out.println("\nArea of square:"+sq.getArea());
        System.out.print(sq.getVolume());

        System.out.println("\nArea of circle:"+ci.getArea());
        System.out.print(ci.getVolume());

        System.out.println("\nArea of cube:"+cb.getArea());
        System.out.println("Volume of cube:"+cb.getVolume());

        System.out.printf("Area of sphere:%.2f",sp.getArea());
        System.out.printf("\nVolume of sphere:%.2f",sp.getVolume());// to read 2 floating
 
    }
}
