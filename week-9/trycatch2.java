/*6. Create your own exception class using the extends keyword. Write a constructor for this
class that takes a String argument and stores it inside the object with a String reference.
Write a method that prints out the stored String. Create a try- catch clause to exercise your
new exception.*/

class parent extends Exception
{
	String str;
	parent(String str)
	{	
	this.str=str;
	}
	void display()
	{	
		System.out.println(str);
	}
}
class trycatch2
{
	public static void main(String args[])
	{
		try
		{
			throw new parent("Exception throwing and storing in string reference");
		}
		catch(parent p)
		{	
		p.display();
		}
	}
}
	
