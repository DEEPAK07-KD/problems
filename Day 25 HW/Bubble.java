import java.util.Scanner;
class Bubble
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Bubble b=new Bubble();
		b.main();
	}
	void main()
	{
		
		System.out.print("ENTER NUMBER OF ELEMENTS : ");
		int ele=sc.nextInt();
		int ar[]=new int[ele];
		int ori[]=new int[ele];
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("ENTER THE INDEX OF "+i+" VALUE IS :");
			ar[i]=sc.nextInt();
			ori[i]=ar[i];
		}
		boolean result=true;
		
		do
		{
			System.out.println("1.ASCENDING");
			System.out.println("2.LARGEST ELEMENTS");
			System.out.println("3.DISPLAY ORIGINAL ARRAY");
			System.out.println("4.EXIT");
			System.out.print("ENTER THE OPTION : ");
			int op=sc.nextInt();
			if(op==1)
			{
				sort(ar);
			}
			else if(op==2)
			{
				large(ar);
			}
			else if(op==3)
			{
				dispaly(ori);
			}
			else
			{
				result=false;
			}
		}while(result);
	}
	void dispaly(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	void large(int a[])
	{
		int lar=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>lar)
			{
				lar=a[i];
			}
		}
		System.out.println("THE LARGEST ELEMENTS IS : "+" "+lar);
	}
	void sort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}