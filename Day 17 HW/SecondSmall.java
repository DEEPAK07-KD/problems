import java.util.Scanner;
class SecondSmall
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE ARRAY SIZE : ");
		int si=sc.nextInt();
		int a[]=new int[si];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("ENTER THE INDEX OF "+ i +" VALUE OF : ");
			a[i]=sc.nextInt();
		}
		int s=a[0];
		int ss=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<s)
			{
				ss=s;
				s=a[i];
			}
			else if(a[i]<ss && a[i] != s)
			{
				ss=a[i];
			}
		}
		System.out.println("THE FIRST SMALLEST NUMBER IS : "+s);
		System.out.println("THE SECOND SMALLEST NUMBER IS : "+ss);
	}
}