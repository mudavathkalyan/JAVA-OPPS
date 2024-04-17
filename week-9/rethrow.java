/*3. Write a program to rethrow an exception – Define methods one() & two(). Method two()
should initially throw an exception. Method one() should call two(), catch the exception
and rethrow it Call one() from main() and catch the rethrown
*/
public class rethrow
{ 
    static void two() throws Exception 
    {
        System.out.println("Method two() is throwing an exception");
        throw new Exception("Exception from method two()");
    }

    static void one() throws Exception 
    {
        try 
        {
            two();
        } 
        catch (Exception e) 
        {
            System.out.println("Caught exception in method one(): " + e.getMessage());
            throw e;//rethrow..
        }
    }

    public static void main(String[] args) 
    {
        try 
        {
            one();
        } catch (Exception e) 
        {
            System.out.println("Caught rethrown exception in main(): " + e.getMessage());
        }
    }
}









