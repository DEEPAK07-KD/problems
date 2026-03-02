class Arms
{
	public static void main(String[] args)
	{
		int a=1333;
		int b=a%10;//3
		int c=a/10;//133
		int d=c%10;//3
		int e=c/10;//13
		int s=e%10;//3
		int r=e/10;//1
		int f=((b*b*b)+(d*d*d)+(s*s*s)+(r*r*r));
		boolean res=a==f;
		System.out.println("The given num is :"+a+" the answer is :"+f+ res);
	}
}