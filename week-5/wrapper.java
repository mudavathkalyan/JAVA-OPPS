//1. Write a Java Program to implement Wrapper classes and their methods.
/*package JAVA.week-5;

public class wrapper 
{
    public static void main(String args[])
    {
        int a=10;
        String x="20";

        String s=Integer.toString(a);//intToString..
        System.out.println(s+20);
        
        int b=Integer.parseInt(s);//valueOf();
        System.out.println(b+20);//StringTOInt

        double d=12.34;
        System.out.println(Double.toString(d)+22);//doubleTOString
        System.out.println(Double.parseDouble(x)+20);//StringToDouble

        
    }   
}
*/
//1. Write a Java Program to implement Wrapper classes and their methods.
public class wrapper
 {
    public static void main(String[] args) {

        String str = "100";
        int IntVal = Integer.valueOf(str);
        float FloatVal = Float.valueOf(str);
        double DoubleVal = Double.valueOf(str);

        System.out.println(IntVal);
        System.out.println(FloatVal);
        System.out.println(DoubleVal);

        int val1 = 10;
        float val2 = 20.0f;
        double val3 = 30.0d;

        String str1 = Integer.toString(val1);
        String str2 = Float.toString(val2);
        String str3 = Double.toString(val3);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        boolean B1 = Boolean.valueOf("true");
        boolean B2 = Boolean.valueOf("false");

        System.out.println(B1);
        System.out.println(B2);

        String str5 = String.valueOf(true);
        String str6 = String.valueOf(false);

        System.out.println(str5);
        System.out.println(str6);

        String str7 = String.valueOf('a');

        System.out.println(str7);

        short st1 = 140;
        int num1 = Integer.valueOf(st1);
        System.out.println(num1);



    }
}
