import java.util.Scanner;
class IntToDouble
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		IntToDouble id=new IntToDouble();
		id.main();
	}
	void main()
	{
		System.out.print("ENTER THE VALUE : ");
		int v=sc.nextInt();
		get(v);
	}
	void get(int b)
	{
		double a=b;
		System.out.print(a);
	}
}