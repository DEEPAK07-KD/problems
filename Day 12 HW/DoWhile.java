class DoWhile
{
	public static void main(String[] args)
	{
		System.out.println("******************************************");
		System.out.println("          Multiplication Table Of 5       ");
		System.out.println("******************************************");
		
		int a= 1;
		int b= 5;
		do
		{
			int c=a*b;
			System.out.println(a+" x "+b+" = "+c);
			a++;
		}
		while(a<=15);
	}
}