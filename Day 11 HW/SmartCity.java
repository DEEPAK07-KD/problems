import java.util.Scanner;
class SmartCity
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*******************************************");
		System.out.println("          SMART CITY UTILITY MENU");
		System.out.println("*******************************************");
		System.out.println("1.Electricity Bill");
		System.out.println("2.Water Bill");
		System.out.println("3.Internet Bill");
		System.out.println("4.Exit");
		System.out.print("Select Any Bill :");
		int select=sc.nextInt();
		if(select==1)
		{
			System.out.println("Electricity Bill");
			System.out.print("Enter Units :");
			int units = sc.nextInt();
			if(units <= 100)
			{
				System.out.println("$2 Per Units");
			}
			else if((units>101)&&(units<300))
			{
				System.out.println("$3 Per Units");
			}
			else if(units > 300)
			{
				System.out.println("$5 Per Units");
			}
		}
		else if(select==2)
		{
			System.out.println("Water Bill");
			System.out.print("Enter House Type :");
			int type = sc.nextInt();
			if(type==1)
			{
				System.out.println("Apartment");
				System.out.println("Monthly Charge = $300");
			}
			else 
			{
				System.out.println("Individual House");
				System.out.println("Monthly Charge = $500");
			}
		}
		else if(select==3)
		{
			System.out.println("Internet Plans");
			System.out.println("1.Basic Plan");
			System.out.println("2.Standard Plan");
			System.out.println("3.Premium Plan");
			System.out.print("Enter Plan :");
			int plan = sc.nextInt();
			if(plan==1)
			{
				System.out.println("Basic Plan Price :$399");
			}
			else if(plan==2)
			{
				System.out.println("Standard Plan Price :$699");
			}
			else if(plan==3)
			{
				System.out.println("Premium Plan Price :$999");
			}
		}
		else if(select==4)
		{
			System.out.println("Exit");
		}
		else
		{
			System.out.println("No Bills Available");
		}
	}
}