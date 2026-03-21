import java.util.Scanner;
class PassValue
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE VALUE : ");
		int val=sc.nextInt();
		System.out.println("BEFORE CHANGE THE VALUE : "+val);
		PassValue pv=new PassValue();
		pv.change(val);
	}
	void change(int a)
	{
		int b=50;
		System.out.println("AFTER CHANGE THE VALUE : "+b);
	}
}