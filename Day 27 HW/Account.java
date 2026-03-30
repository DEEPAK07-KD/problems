import java.util.Scanner;
class Account
{
	double balance;
	double deposit;
	double withdraw;
	public static void main(String[] args)
	{   
		Scanner sc=new Scanner(System.in);
		double b=1000;
		//balance
		System.out.println("CURRENT BALANCE :"+b);
		//deposit
		System.out.print("ENTER THE DEPOSITE AMOUNT : ");
		double insert=sc.nextDouble();
		b=insert+b;
		System.out.println(b+" THE AMOUNT DEPOSITED SUCCESSFULLY");
		//withdraw
		System.out.print("ENTER THE WITHDRAWAL AMOUNT : ");
		double wi=sc.nextDouble();
		if(wi<b)
		{
			b=b-wi;
			System.out.println("WITHDRAWAL SUCCESSFULLY ");
		}
		Account a=new Account();
		a.balance=b;
		a.deposit=insert;
		a.withdraw=wi;
		System.out.println(a.balance);
	}
	
}