import java.util.Scanner;
class Color
{
	public static void main(String[] args)
	{
		Scanner n=new Scanner(System.in);
		System.out.print("enter the number :");
		int num = n.nextInt();
		switch(num)
		{
			case 1:
			{
				System.out.println("Red Means Fire Emulsion");
				break;
			}
			case 2:
			{
				System.out.println("Green means Nature");
				break;
			}
			case 3:
			{
				System.out.println("Blue Means ocean");
			}
		}
	}
}	