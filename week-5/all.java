/*5. Write Java program for the following
a. Example for this operator and the use of this keyword.
b. Example for super keyword.
c. Example for static variables and methods. */

import java.util.*;
class parent
{	
	int a;
	parent(int a)
	{
		this.a=a;
		System.out.println(a);
	}	
}
class child extends parent
{
   
    child(int x,int y)
    {
    	super(x);//super keyword goes to parent
    	System.out.println(x+y);
    }
    static String str="Hello";
    static void display()
    {
    		System.out.println("Am static method:"+str);//static variables only cal acess..
    }
}
public class all 
{
    public static void main(String[] args) 
    {
     	child c=new child(10,20);
     	child.display();	
    }
}
