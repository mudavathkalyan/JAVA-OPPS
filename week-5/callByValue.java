/*3. Write a JAVA program for the following
a. Call by value
b. Call by object
 */
//package JAVA.week-5;

import java.util.*;
class callBy
{
    int val;
    public callBy(int val)
    { 
    this.val=val;
    }
    void callByValue(int num)
    {
        System.out.println("Call by value:"+num);
    }
    void callByObject(callBy obj)
    {
        System.out.println("call by object:"+obj.val);
    }
}

public class callByValue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        callBy obj=new callBy(num);//constructor
        
        obj.callByValue(obj.val);
        obj.callByObject(obj);
    }
}
