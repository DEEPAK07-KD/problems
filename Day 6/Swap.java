class Swap
{
	public static void main(String[] args)
	{
		int a=40;
		int b=60;
		System.out.println("before Swapping");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println("after Swapping");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
	}
}