import java.util.Scanner;
class LinearBinarySorted
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		LinearBinarySorted lbs=new LinearBinarySorted();
		lbs.main();
	}
	void main()
	{
		Scanner se=new Scanner(System.in);
		System.out.print("ENTER THE ARRAY SIZE : ");
		int size=se.nextInt();
		int ar[]=new int[size];
		boolean result=true;
		do{
			System.out.println("*************************************");
			System.out.println("      LINEAR AND BINARY SEARCH       ");
			System.out.println("*************************************");
			System.out.println("1.INSERT ELEMENTS");
			System.out.println("2.DISPLAY ELEMENTS");
			System.out.println("3.LINEAR SEARCH");
			System.out.println("4.BINARY SEARCH");
			System.out.println("5.EXIT");
			System.out.print("CHOOSE YOUR OPTION : ");
			int op=sc.nextInt();
			if(op==1)
			{
				insert(ar);
			}
			else if(op==2)
			{
				display(ar);
			}
			else if(op==3)
			{
				System.out.print("CHOOSE LINEAR TARGET : ");
				int target=sc.nextInt();
				int re=linear(ar,target);
				System.out.println(re);
			}
			else if(op==4)
			{
				System.out.print("CHOOSE BINARY TARGET : ");
				int target=sc.nextInt();
				int res=binary(ar,target);
				System.out.println(res);
			}
			else
			{
				result=false;
			}
		}while(result);
	}
	void insert(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
		System.out.print("ENTER THE INDEX OF "+i+" VALUE IS :");
		ar[i]=sc.nextInt();
		}
	}
	void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	int linear(int ar[],int target)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
	int binary(int are[],int target)
	{
		int left=0;
		int right=are.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(are[mid]==target)
			{
				return mid;
			}
			else if(are[mid]<target)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		return -1;
	}
}