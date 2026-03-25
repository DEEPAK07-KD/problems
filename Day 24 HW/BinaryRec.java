import java.util.Scanner;
class BinaryRec
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Scanner se=new Scanner(System.in);
		System.out.print("ENTER THE ARRAY SIZE : ");
		int size=se.nextInt();
		int arr[]=new int[size];
		BinaryRec br=new BinaryRec();
		br.insert(arr);
		int left=0;
		int right=arr.length-1;
		System.out.print("ENTER THE TARGET : ");
		int target=se.nextInt();
		int result=br.bsearch(arr,left,right,target);
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
			System.out.print("ENTER THE INDEX OF "+i+" VALUE IS : ");
			a[i]=sc.nextInt();
		}
	}
	int bsearch(int ar[],int l,int r,int t)
	{
		if(l>=r)
		{
			return-1; 
		}
		int m=l+r/2;
		if(ar[m]==t)
		{
			return m;
		}
		if(t<ar[m])
		{
			return bsearch(ar,l,m-1,t);
		}
		return bsearch(ar,m+1,r,t);
	}
}