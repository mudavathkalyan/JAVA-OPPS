/*2. Write a program that shows that the order of the catch blocks is important. If you try to
catch a superclass exception type before a subclass type, the compiler should generate
errors.*/
class catchorder
{
	public static void main(String args[])
	{	
		int a[]={1,2,3};
		try
		{
		 System.out.println(a[10]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)//error since order matters
		
		{
			System.out.println(e);
		}
		
	}
}
