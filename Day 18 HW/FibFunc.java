import java.util.Scanner;
class FibFunc
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int n=sc.nextInt();
		FibFunc f1=new FibFunc();
	
			int result=f1.fib(n);
			
	}
	int fib(int n)
	{
		int a=0;
		int b=1;
			System.out.print("FIBONACCI SERIES : "+a+" "+b);
		
		 for(int i = 2; i <= n; i++)
		{
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
		return n;
	}
}