import java.util.Scanner;
class Even
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE STARTING NUMBER :");
		int s=sc.nextInt();
		System.out.print("ENTER THE ENDING NUMBER :");
		int e=sc.nextInt();
		for(int i=s;i<=e;i++)
		{
			if(i%2==0)
			{
				System.out.println("The Even Number Between 1 to 50  :"+i);
			}
		}
	}
}