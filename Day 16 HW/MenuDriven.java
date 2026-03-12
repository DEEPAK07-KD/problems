import java.util.Scanner;
class MenuDriven
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("INSERT ELEMENTS :");
		int element=sc.nextInt();
		int a[]=new int[element];
		int ecount=0;
		int ocount=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.print("ENTER THE "+i+" INDEX VALUE : ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("The Even Numbers is :"+a[i]);
				ecount++;
			}
			else
			{
				System.out.println("The Odd Numbers is :"+a[i]);
				ocount++;
			}
		}
		System.out.println("The Even Count Numbers is :"+ecount);
		System.out.println("The Odd Count Numbers is :"+ocount);
		System.out.println("Exit");
	}
}
