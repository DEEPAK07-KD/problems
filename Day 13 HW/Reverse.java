import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE ANY NUMBER :");
		int r=sc.nextInt();
		for(int i=r;i>=0;i--)
		{
			System.out.println("THE REVERSE NUMBER IS :"+i);
		}
	}
}