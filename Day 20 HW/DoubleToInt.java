import java.util.Scanner;
class DoubleToInt
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		DoubleToInt di=new DoubleToInt();
		di.main();
	}
	void main()
	{
		System.out.print("ENTER DOUBLE VALUE : ");
		double d=sc.nextDouble();
		convert(d);
	}
	void convert(double a)
	{
		int b=(int)a;
		System.out.print(b);
	}
}