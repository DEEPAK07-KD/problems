import java.util.Scanner;
class CharToInt
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		CharToInt ci=new CharToInt();
		ci.main();
	}
	void main()
	{
		System.out.print("ENTER THE CHAR VALUE : ");
		char v=sc.next().charAt(0);
		get(v);
	}
	void get(char b)
	{
		int a=b;
		System.out.print(a);
	}
}