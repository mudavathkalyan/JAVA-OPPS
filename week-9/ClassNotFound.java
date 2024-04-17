/*4. Exception Handling program for ClassNotFoundException--thrown if a program can not
find a class it depends at runtime (i.e., the class's ".class" file cannot be found or was
removed from the CLASSPATH).*/

class parent
{
	parent()
	{
		System.out.println("HELLO");
	}
}
public class ClassNotFound 
{
   public static void main(String args[])
	{	
		try
		{	
			//Attempting to load a class that not exists.....
			Class.forName("parent1");
		}
		catch(Exception e)
		{
			System.out.println("class not found::"+e);
			//e.printStackTrace();no prob
		}
	}
}
