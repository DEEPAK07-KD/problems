class Battery
{
	public static void main(String[] args)
	{
		int percentage = 45;
		if(percentage >= 80)
		{
			System.out.println("Battery Full");
		}
		else if((percentage>=30)&&(percentage<=79))
		{
			System.out.println("Battery Normal");
		}
		else if(percentage<30)
		{
			System.out.println("Low Battery");
			System.out.println("Charge Now");
		}
		else
		{
			System.out.println("Power OFF");
		}
	}
}