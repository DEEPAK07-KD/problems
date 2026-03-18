import java.util.Scanner;
class SecondLarge
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE ARRAY SIZE : ");
		int si=sc.nextInt();
		int a[]=new int[si];
		int f=0;
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.print("ENTER THE INDEX OF "+ i +" VALUE OF : ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>f)
			{
				s=f;
				f=a[i];
			}
			else if(a[i]>s)
			{
				s=a[i];
			}
		}
		System.out.println("THE FIRST LARGEST NUMBER IS : "+f);
		System.out.println("THE SECOND LARGEST NUMBER IS : "+s);
	}
}