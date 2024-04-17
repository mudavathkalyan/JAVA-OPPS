//class not found exception
import java.io.IOException;
class parent 
{	
}
class code1
{
	
	public static void main(String args[])
	{
		try
		{
			parent p=new parent();
			p.method1();
		 System.out.println("class not found exception"+e.getMessage());
		}	
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		
		
	}
}
