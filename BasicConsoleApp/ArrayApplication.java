import java.util.Scanner;
class ArrayApplication
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER ARRAY SIZE: ");
		int ar=sc.nextInt();
		int a[]=new int[ar];
		boolean result=true;
		int sum=0;
		int rev=0;
		for(int i=0;i<a.length;i++)
			{
					System.out.print("ENTER THE INDEX "+i+" VALUE IS: ");
					a[i]=sc.nextInt();
			}
		do{
			System.out.println("**************************************************");
			System.out.println("         WELCOME TO THE ARRAY CONSOLE             ");
			System.out.println("**************************************************");
			
			System.out.println("1.ARRAY SUM");
			System.out.println("2.ARRAY PRINT");
			System.out.println("3.ARRAY REVERSE PRINT");
			System.out.println("4.EXIT");
			System.out.println("ENTER THE OPTION: ");
			int op=sc.nextInt();
			if(op==1)
			{
				System.out.println("THE ARRAY SUM IS:");
				for(int i=0;i<a.length;i++)
				{
				sum=sum+a[i];
				}
				System.out.println(sum);
			}
			else if(op==2)
			{
				System.out.println("THE ARRAY NUMBERS IS:");
				for(int i=0;i<a.length;i++)
				{
				System.out.println(a[i]);
				}
			}
			else if(op==3)
			{
				System.out.println("THE REVERSE NUMBER IS: ");
				for(int i=a.length-1;i>=0;i--)
				{
					System.out.println(a[i]);
				}
			}
			
			else
			{
				result=false;
				System.out.println("THE ARRAY APPLICATION IS EXITED");
				System.out.println("TATA BYE BYE....");
			}
		}while(result);
	}
}