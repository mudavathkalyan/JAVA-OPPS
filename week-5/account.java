/*4. Create a class Account with an instance variable balance (double). It shouldcontain a
constructor that initializes the balance, ensure that the initial balance is
greater than 0.0.
Acct details : Acct_Name, Acct_acctno, Acct_Bal, Acct_Address.
Create two methods namely credit and debit, getBalance.
The Credit adds the amount (passed as parameter) to balance and does not return any
data. Debit method withdraws money from an Account. GetBalance displays the
amount. */
//package JAVA.week-5;
import java.util.*;
class Account
{   
    String name;
    String acNo;
    double balance;
    
    String address;
    void getDetails()
    {
        System.out.println("Account holder Name:"+name);
        System.out.println("Account number:"+acNo);
        System.out.println("Account Balance:"+balance);
        System.out.println("Account Holder Address:"+address);
    }
    void credit(double add)
    {
        balance+=add;
        System.out.println(add+"ruppes add Sucessfully:");
        System.out.println("Current Balance="+balance);
    }
    void debit(double add)
    {
        if(balance<add)
        {
            System.out.println("No balance Sufficient balance :");
            System.out.print("Current balance is:"+balance);
        }
        else
        {
        balance-=add;
        System.out.println(add+"rupees debited Sucessfully :");
        System.out.println("Currrent balance is"+balance);
        }
    }
}

public class account 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Account b=new Account();
        System.out.print("Enter the name of Account holder:");
        b.name=sc.nextLine();
        System.out.print("Enter Account number :");
        b.acNo=sc.nextLine();
        System.out.print("Enter the Initial balance:");
        b.balance=sc.nextDouble();
        System.out.print("Enter the address of account holder:");
        b.address=sc.next();
        b.getDetails();
        while(true)
        {
        System.out.print("\nEnter:\n1.credit\n2.debit\n3.checkBalance\n4.stop:\nEnter your choice:");
        
        int n=sc.nextInt();
       switch(n)
        {
        	case 1: System.out.print("Enter the amount to be credited:");
        	b.credit(sc.nextDouble());
        	break;
        	case 2: System.out.print("Enter the amount to debited:");
        	b.debit(sc.nextDouble());
        	break;
        	case 3:System.out.print("Current Balance:"+b.balance);
        	break;
        	case 4:System.out.print("Exited:");
        	System.exit(0);
        	default :System.out.println("Invalid:");
        	}
        }
    }   
}
