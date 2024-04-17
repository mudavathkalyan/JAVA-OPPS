/*3. Write a Java program to create package called dept. Create four classes as CSE, ECE, ME
and CE add methods in each class which can display subject names of your respect year.
access this package classes from main class .*/

//import dept.cse;
//import dept.ece;
//import dept.ce;
//import dept.me;
package pack;
import dept.*;
public class code3 
{
    public static void main(String[] args) 
    {
       cse c=new cse();
       ece e=new ece();
       me m=new me();
       ce cc=new ce();
       c.cseSubjects();
       e.eceSubjects();
       m.meSubjects();
       cc.ceSubjects();
    }    
}
