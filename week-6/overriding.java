/*2. Write a Java program which can give example of Method overloading and overriding */

class parent
{
    void display()
    {
        System.out.println("Parent method");
    }
}
class child extends parent
{
    void display()
    {
        System.out.println("Over riding parent method:");    
    }
    void show(int a)
    {
    		System.out.println("With one arg:"+a);
    }
    void show(int a,int b)
    {
	  System.out.println("With two arg:"+a+","+b);  	
    }
    
}
public class overriding 
{
    public static void main(String[] args)
    {  
        child c=new child();
        c.display();
        c.show(10);
        c.show(20,21);
    }
}
