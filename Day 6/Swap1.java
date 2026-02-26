class Swap1
{
	public static void main(String[] args)
	{
		int a=30;
		int b=40;
		System.out.println("before Swapping");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after Swapping");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
	}
}