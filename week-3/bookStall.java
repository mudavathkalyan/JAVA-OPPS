/* 5. Implement the following case study using OOP concepts in Java.
E-Book stall :
Every book has Properties which includes : Book _Name, Book_Author, Book_Count ;
Every Customer is having properties as : Customer_Id, Customer_Name,
Customer_Address and he can buy Books from E-Book stall.
Write a Program which will display the text book name and the remaining count of text
books when a customer buys a text book.*/

import java.util.*;
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
class bookStall
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the different types of books::");
		int totalbook=sc.nextInt();
		sc.nextLine();

		bookDetails book[]=new bookDetails[totalbook];

		for(int i=0;i<totalbook;i++)		
		{
			book[i] = new bookDetails();

			System.out.print("Enter "+(i+1)+" book details:");
			System.out.print("\nEnter book Name:");
			book[i].bookName=sc.nextLine();
	
			System.out.print("Enter book Author Name:");
			book[i].bookAuthor=sc.nextLine();
			System.out.print("Enter book's Count:");
			book[i].bookCount=sc.nextInt();
			sc.nextLine();
			
		}

		System.out.print("Enter the number of customer in the bookStall:");
		int totalcustomer=sc.nextInt();
		
		customerDetails cust[]=new customerDetails[totalcustomer];
		for(int i=0;i<totalcustomer;i++)
		{	
			cust[i] = new customerDetails();
			System.out.print("Enter "+(i+1)+" customer id:");
			cust[i].customerId=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter "+(i+1)+" customer Name:");
			cust[i].customerName=sc.nextLine();
			System.out.print("Enter "+(i+1)+" customer Address:");
			cust[i].customerAddress=sc.nextLine();
			// cust[i]=new customerDetails(cid, cname, cAddress);
		}
		System.out.print("Enter the id of customer who wanted to buy book:");
		int buyId=sc.nextInt();
		int  b=0;
		for(int i=0;i<totalcustomer;i++)
		{
			if(buyId==cust[i].customerId)
			{
				System.out.println("customer found of id:"+cust[i].customerId);
				b=1;
				break;
			}
		}
		if(b==0)
		{
			System.out.println("The customer Id not matched:");
			System.exit(0);
		}
		else
		{

			sc.nextLine();
			System.out.print("Enter the book name that wanted to buy:");
			String buyBook=sc.nextLine();
			int  check=0;
			for(int i=0;i<totalbook;i++)
			{
				if(buyBook.equals(book[i].bookName))
				{
				 check = 1;
				 System.out.println("BooK found And the customer is buying it...");
				 int bCount=book[i].bookCount;
				 bCount--;
    System.out.println("Details are :\nBook name is :"+buyBook+"\nTotal count remining :"+bCount);
    System.out.print("\nBook sold Sucessfully....");
				 break;

				}
			}
			if(check==0)
			{
				System.out.println("No stock::");
			}
		}
	}
}


