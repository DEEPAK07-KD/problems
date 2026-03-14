import java.util.Scanner;
class BasicApplication
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE FIRST VALUE: ");
		int f=sc.nextInt();
		System.out.print("ENTER THE SECOND VALUE: ");
		int s=sc.nextInt();
		System.out.print("ENTER THE THIRD VALUE: ");
		int t=sc.nextInt();
		boolean result = true;
		do{
			System.out.println("************************************************");
			System.out.println("          WLCOME TO MY FIRST CONSOLE            ");
			System.out.println("************************************************");
			System.out.println("1.ADDITION");
			System.out.println("2.SUBSTRACTION");
			System.out.println("3.MULTIPULICATION");
			System.out.println("4.EXIT");
			System.out.println("ENTER YOUR OPTION: ");
			int op=sc.nextInt();
			if(op==1)
			{
				int total=f+s+t;
				System.out.println("THE ADDITION NUMBER IS: "+total);
			}
			else if(op==2)
			{
				int total=f-s-t;
				System.out.println("THE SUBSTRACTION NUMBER IS: "+total);
			}
			else if(op==3)
			{
				int total=f*s*t;
				System.out.println("THE MULTIPULICATION NUMBER IS: "+total);
			}
			else
			{
				result=false;
				System.out.println("THE APPLICATION IS EXIT");
			}
		}while(result);
	}
}