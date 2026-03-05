import java.util.Scanner;
class CarsShop
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("******************************************************");
		System.out.println("            Wlcome to Car World");
		System.out.println("******************************************************");
		System.out.println("Car Brand Names:");
		System.out.println("1.BMW");
		System.out.println("2.Hyundai");
		System.out.println("3.Mahindra");
		System.out.print("Choose Your Brand :");
		int brand = sc.nextInt();
		if(brand==1)
		{
			System.out.println("1.Sedans 8Series");
			System.out.println("2.Z4 Roadster");
			System.out.println("3.Elecric I-Models");
			System.out.print("Choose Your BMW Cars :");
			int bmw=sc.nextInt();
			if(bmw==1)
			{
				System.out.println("Sedans 8Series Price :₹1.83crore");
			}
			else if(bmw==2)
			{
				System.out.println("Z4 Roadster Price :₹92.61 Lakhs");
			}
			else 
			{
				System.out.println("Elecric I-Models Price :₹2.5Crore");
			}
		}
		else if(brand==2)
		{
			System.out.println("1.SUVs");
			System.out.println("2.Sedans");
			System.out.println("3.HatchBacks");
			System.out.print("Choose Your Hyundai Cars :");
			int Hyu=sc.nextInt();
			if(Hyu==1)
			{
				System.out.println("SUVs Price :₹8.00Lakhs");
			}
			else if(Hyu==2)
			{
				System.out.println("Sedans Price :₹6.00Lakhs");
			}
			else 
			{
				System.out.println("HatchBacks Price :₹10.44Lakhs");
			}
		}
		else if(brand==3)
		{
			System.out.println("1.Scorpio-N");
			System.out.println("2.Thar");
			System.out.println("3.Marazzo");
			System.out.print("Choose Your Mahindra Cars :");
			int Mahi=sc.nextInt();
			if(Mahi==1)
			{
				System.out.println("Scorpio-N Price :₹20Lakhs");
			}
			else if(Mahi==2)
			{
				System.out.println("Thar Price :₹14Lakhs");
			}
			else 
			{
				System.out.println("Marazzo Price :₹25Lakhs");
			}
		}
		else
		{
			System.out.println("The Given brand Is Not Available in this Car World");
		}
	}
}