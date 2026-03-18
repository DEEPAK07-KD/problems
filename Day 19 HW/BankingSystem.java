import java.util.Scanner;
class BankingSystem
{
	Scanner sc=new Scanner(System.in);
	double balance=0;	
	public static void main(String[] args)
	{
		BankingSystem bs=new BankingSystem();
		bs.main();
	}	
	void main()
	{
		int amu;
		boolean result=true;
		do
		{
		System.out.println("************************************");
		System.out.println("         BANKING SYSTEM             ");
		System.out.println("************************************");
		System.out.println("1.DEPOSIT");
		System.out.println("2.WITHDRAW");
		System.out.println("3.CHECK BALANCE");
		System.out.println("4.EXIT");
		System.out.print("CHOOSE YOUR OPTION : ");
		int op=sc.nextInt();
		if(op==1)
		{
			dep(balance);
		}
		else if(op==2)
		{
			with(balance);
		}
		else if(op==3)
		{
			bal(balance);
		}
		else
		{
			result=false;
		}
		}while(result);
	}
	void dep(double a)
	{
		System.out.print("ENTER THE AMOUNT OF DEPOSITE : ");
		double insert=sc.nextDouble();
		balance=insert+balance;
		System.out.println("AMOUNT DEPOSITED SUCCESSFULLY : "+balance);
	}
	void with(double b)
	{
		System.out.print("ENTER THE WITHDRAWEL AMOUNT : ");
		double wi=sc.nextDouble();
		if(wi<=balance)
		{
			balance=balance-wi;
		System.out.println("WITHDRAWEL SUCCESSFULLY ");
		}
		
	}
	void bal(double c)
	{
		System.out.println("CURRENT BALANCE : "+c);
	}
}