import java.util.Scanner;
import java.util.Arrays;
class PassRefernce
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("ENTER THE ARRAY SIZE : ");
		int size=sc.nextInt();
		int ar[]=new int[size];
		PassRefernce pr=new PassRefernce();
		pr.change(ar);
		
		System.out.println("BEFORE CHANGING ARRAY"+Arrays.toString(ar));
		pr.modify(ar);
		System.out.println("AFTER CHANGING ARRAY"+Arrays.toString(ar));
		
	}
	void change(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("ENTER THE INDEX OF "+ i +" VALUE IS : ");
			arr[i]=sc.nextInt();
		}
	}
	void modify(int arr[])
	{
		arr[1]=20;
	}
}