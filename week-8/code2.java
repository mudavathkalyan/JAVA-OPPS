/*2.Create a package named org.shapes. Create some classes in the package
representing some common geometric shapes like Square, Triangle, Circle and so
on. write a Program that uses the classes from the package. */
import org.shapes.circle;
import org.shapes.square;
import org.shapes.triangle;
public class code2 
{
    public static void main(String[] args) 
    {
     circle c=new circle();
     square s=new square();
     triangle t=new triangle();
     c.ciDisplay();
     s.sqDisplay();
     t.triDisplay();   
    }
}
