class Pali
{
	public static void main(String[] args)
	{
		int a=115;
		int b=a%10;
		int c=a/10;
		int d=c%10;
		int e=c/10;
		int f=b*100+d*10+e*1;
		boolean res=a==f;
		System.out.println("the given num is :"+a+" the answer is :"+f+" "+res);
	}
}