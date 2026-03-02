class Mixed
{
	public static void main(String[] args)
	{
		int a=10;
		int b=5;
		int c=15;
		int d=a+b+c;
		System.out.println("The ArithMatic Operator : "+d);
		boolean e= (a+b) < (b+c);
		System.out.println(e);
		System.out.println(!(a<c)&&(c>b) || (a<b)&&(c>a));
	}
}