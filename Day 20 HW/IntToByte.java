import java.util.Scanner;
class IntToByte
{
	Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		IntToByte ib=new IntToByte();
		ib.main();
	}
	void main()
	{
		System.out.print("ENTER THE INTEGER VALUE : ");
		int i=sc.nextInt();
		convert(i);
	}
	void convert(int a)
	{
		byte b=(byte)a;
	
		System.out.print(b);
	}
}