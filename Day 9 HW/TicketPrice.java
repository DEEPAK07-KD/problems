class TicketPrice
{
	public static void main(String args[])
	{
		int age = 25;
		if(age<12)
		{
			System.out.println("The Ticket Price is :₹80");
		}
		else if((age>12)&&(age<59))
		{
			System.out.println("The Ticket Price is :₹150");
		}
		else if(age>=60)
		{
			System.out.println("The Ticket Price is :₹100");
		}
		else
		{
			System.out.println("The Ticket is not Available");
		}
	}
}