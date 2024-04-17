/*5. Implement the following case study using OOP concepts in Java.
E-Book stall :
Every book has Properties which includes : Book _Name, Book_Author, Book_Count ;
Every Customer is having properties as : Customer_Id, Customer_Name,Customer_Address and 
he can buy Books from E-Book stall.
Write a Program which will display the text book name and the remaining count of text
books when a customer buys a text book.*/
import java.util.*;
class book
{
	String bname,bauthor;
	int bcount;
	book(String bname,String bauthor,int bcount)
	{
		this.bname=bname;
		this.bauthor=bauthor;
		this.bcount=bcount;
	}
}
class bookstall2
{
	String cname,cadd;
	int cid;
	customer(int cid,String cname,String cadd)
	{
			this.cid=cid;
			this.cname=cname;
			this.cadd=cadd;
	}
}

class practice
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of diffrent type of books:");
		int diff=sc.nextInt();
		book b[]=new book[diff];
		sc.nextLine();
		for(int i=0;i<diff;i++)
		{
			System.out.print("Enter"+(i+1) +"book name:");
			String bname=sc.nextLine();
			System.out.print("Enter"+(i+1) +"book author:");
			String bauthor=sc.nextLine();
			System.out.print("Enter"+(i+1) +"book count:");
			int bcount=sc.nextInt();
			sc.nextLine();
			b[i]=new book(bname,bauthor,bcount);
		}
		System.out.print("Enter no of customers:");
		int nc=sc.nextInt();
		customer cus[]=new customer[nc];
		for(int i=0;i<nc;i++)
		{
			System.out.print("Enter "+(i+1)+" customer id:");
			int cid=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter "+(i+1)+" customer name:");
			String cname=sc.nextLine();
			System.out.print("Enter "+(i+1)+" customer Address:");
			String cadd=sc.nextLine();
			cus[i]=new customer(cid,cname,cadd);
		}
		System.out.print("Enter the id of customer who tries to buy book::");
		int checkId=sc.nextInt();
		sc.nextLine();
		boolean check=true;
		for(int i=0;i<nc;i++)
		{
			if(checkId==cus[i].cid)
			{
				check=false;			
				System.out.println("custer of id "+(cus[i].cid)+"is buying book:");
				System.out.print("Enter the book name wanted to buy:");
				String checkBook=sc.nextLine();
				for(int j=0;j<diff;j++)
				{
					if(checkBook.equals(b[j].bname))////////////
					{
						
						System.out.print("Book usually have :");
						int checkCount=b[j].bcount;
						if(checkCount!=0)
						{
							System.out.println("In stock");//text book name and the remaining count of text
							System.out.println("customer buying it:");
							b[j].bcount--;
							System.out.print("Book name:"+b[j].bname+"\nRemaining count is:"+b[j].bcount);
								System.out.println("\nSucessfully sold :");
								System.exit(0);
						}
						else
						{
							System.out.println("Out of stack:");
							System.exit(0);
						}
					}
				}
			}
		}
		if(check==true)
		{	
			System.out.print("Customer not found:");
			System.exit(0);
		}
	}
}
