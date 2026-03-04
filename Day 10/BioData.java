import java.util.Scanner;
class BioData
{
	public static void main(String[] args)
	{
		Scanner n=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.println("**********MY BIODATA**********");
		System.out.print("ENTER YOUR NAME :");
		String name=s.nextLine();
		System.out.print("ENTER YOUR AGE :");
		int age = n.nextInt();
		System.out.print("ENTER YOUR MOBILE NO :");
		long MNo=n.nextLong();
		System.out.println("My Name is :"+name);
		System.out.println("My Age is :"+age);
		System.out.println("My Contact No is :"+MNo);
	}
}