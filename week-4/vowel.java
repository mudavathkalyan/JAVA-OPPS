/*5. Write a Java program to print all vowels in given string and count number of vowels and
consonants present in given string*/
import java.util.*;
public class vowel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a String:");
		String str1=sc.nextLine();
		int vowel=0,consonent=0;
		int len=str1.length();
		System.out.print("Vowels are:");
		for(int i=0;i<len;i++)
		{
		 	char str2=str1.charAt(i);
		 	if(str2=='a'|| str2=='e'|| str2=='i'|| str2=='o'|| str2=='u'|| str2=='E'|| str2=='O'||
		 	    str2=='A'||str2=='i'|| str2=='U')
		 	{
		 	vowel++;
		 	System.out.print(str2+" ");
		 	}
		 	else if((str2>='a' && str2<='z' )||(str2>='A' && str2<='Z'))
		 	{
		 		consonent++;
		 	}
		 }
		 System.out.println("");
		 	System.out.println("The count of vowel:"+vowel);
		 	System.out.println("the count of consonent:"+consonent);
	}
}
