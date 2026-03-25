import java.util.Scanner;
class LinearRec
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Scanner se=new Scanner(System.in);
		System.out.print("ENTER THE ARRAY SIZE : ");
		int size=se.nextInt();
		int arr[]=new int[size];
		LinearRec lr=new LinearRec();
		lr.insert(arr);
		System.out.print("ENTER THE TARGET : ");
		int target=se.nextInt();
		int result=lr.lsearch(arr,0,target);
		System.out.println(result);
		if(arr[result]==target)
		{
			System.out.println("THE INDEX OF ELEMENT"+" "+arr[result]+" "+" IS FOUND :");
		}
		else
		{
			System.out.println("THE INDEX OF ELEMENT NOT FOUND :");
		}
	}
	void insert(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print("ENTER THE INDEX OF :"+i+" VALUE IS :");
			a[i]=sc.nextInt();
		}
	}
	int lsearch(int ar[],int i,int t)
	{
		if(i>=ar.length)
		{
			return -1;
		}
		if(ar[i]==t)
		{
			return i;
		}
		return lsearch(ar,i+1,t);
	}
}