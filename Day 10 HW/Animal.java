import java.util.Scanner;
class Animal
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
				System.out.println("Dog");
				System.out.println("Dog is Barks");
				break;
			}
			case 2:
			{
				System.out.println("Cat");
				System.out.println("Cat Says Meow");
				break;
			}
			case 3:
			{
				System.out.println("Cow");
				System.out.println("Cow says Moo");
				break;
			}
		}
	}
}