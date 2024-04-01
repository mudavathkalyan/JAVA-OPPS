/*5. Implement the following case study using OOP concepts in Java.
E-Book stall :
Every book has Properties which includes : Book _Name, Book_Author, Book_Count ;
Every Customer is having properties as : Customer_Id, Customer_Name,
Customer_Address and he can buy Books from E-Book stall.
Write a Program which will display the text book name and the remaining count of text
books when a customer buys a text book.*/
import java.util.*;
class book
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of types of books:");
		int bno=sc.nextInt();
		
		bookDetails b[]=new bookDetails[bno];
		sc.nextLine();
		for(int i=0;i<bno;i++)
		{
		b[i]=new bookDetails();
			System.out.print("Enter "+(i+1)+" bookName:");
			b[i].bookName=sc.nextLine();
			System.out.print("Enter "+(i+1)+" bookAuthor:");
			b[i].bookAuthor=sc.nextLine();
			System.out.print("Enter "+(i+1)+" bookCount:");
			b[i].bookCount=sc.nextInt();
			sc.nextLine();
			
		}
		System.out.println("Enter the no of customers:");
		int cno=sc.nextInt();
		
		customerDetails c[]=new customerDetails[cno];
		for(int i=0;i<cno;i++)
		{
			c[i]=new customerDetails();
			System.out.print("Enter "+(i+1)+" customerId:");
			c[i].customerId=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter "+(i+1)+" CustomerName:");
			c[i].customerName=sc.nextLine();
			System.out.print("Enter "+(i+1)+" customerAddress:");
			c[i].customerAddress=sc.nextLine();
		}
		
		System.out.print("Enter the id of customer who wanted to buy the book:");
		int checkId=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<cno;i++)
		{
			if(checkId==c[i].customerId)
			{
				flag=true;
			}
		}
		if(flag==true)
		{
				System.out.println("Customer found :");
				System.out.println("Enter the bookName customer wants to buy:");
				sc.nextLine();
				String checkBook=sc.nextLine();
				flag=false;
				int j=0;
				for(int i=0;i<bno;i++)
				{
					if(checkBook.equals(b[i].bookName))
					{
						flag=true;
						j=i;
					}
				}
				if(flag==true)
				{
					if(b[j].bookCount>0)
					{
						System.out.println("Book found :");
						System.out.println("Book sold is :"+b[j].bookName);
						int count=b[j].bookCount;
						count--;
						System.out.println("Book count :"+count);
						
					}
					else
					{
						System.out.println("Book out of stock:");
						System.exit(0);
					}
				}
				else
				{
					System.out.println("Book not found :");
					System.exit(0);
				}
				
				
				
				
		}
		else
		{
			System.out.println("Customer not found :");
			System.exit(0);
		}
		
		
	}		
}
class bookDetails
{
	String bookName,bookAuthor;
	int bookCount;

}
class customerDetails
{
	int customerId;
	String customerName,customerAddress;
}























