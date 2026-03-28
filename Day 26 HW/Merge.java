import java.util.Scanner;
import java.util.Arrays;
class Merge
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Merge m=new Merge();
		m.main();
	}
	void main()
	{
		System.out.print("ENTER THE ARRAY SIZE : ");
		int size=sc.nextInt();
		int a[]=new int[size];
		boolean result=true;
		do{
			System.out.println("****************************************");
			System.out.println("           MERGE SORT                   ");
			System.out.println("****************************************");
			System.out.println("1.ENTER ARRAY");
			System.out.println("2.ASSENDING ORDER");
			System.out.println("3.DESENDING ORDER");
			System.out.println("4.FIND MEDIAN");
			System.out.println("5.DISPLAY ARRAY");
			System.out.println("6.EXIT");
			System.out.print("CHOOSE YOUR OPTION");
			int op=sc.nextInt();
			if(op==1)
			{
				get(a);
			}
			else if(op==2)
			{
				int[] res=assending(a);
				System.out.println(Arrays.toString(res));
			}
			else if(op==3)
			{
				int[] res=desending(a);
				System.out.println(Arrays.toString(res));
			}
			else if(op==4)
			{
				int res=median(a);
				System.out.println(res);
			}
			else if(op==5)
			{
				display(a);
			}
			else
			{
				result=false;
			}
		}while(result);
	}
	void get(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print("ENTER THE INDEX OF "+i+" VALUE IS :");
			a[i]=sc.nextInt();
		}
	}
	int[] assending(int ar[])
	{
		if(ar.length==1)
		{
			return ar;
		}
		int mid=ar.length/2;
		int left[]=assending(Arrays.copyOfRange(ar,0,mid));
		int right[]=assending(Arrays.copyOfRange(ar,mid,ar.length));
		return conquer(left,right);
	}
	int[] conquer(int left[],int right[])
	{
		int i=0,j=0,k=0;
		int newarr[]=new int[left.length+right.length];
		while(i<left.length && j<right.length)
		{
			if(left[i]<right[j])
			{
				newarr[k]=left[i];
				i++;
				k++;
			}
			else
			{
				newarr[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<left.length)
		{
			newarr[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			newarr[k]=right[j];
			j++;
			k++;
		}
		return newarr;
	}
	int[] desending(int are[])
	{
		if(are.length==1)
		{
			return are;
		}
		int mid=are.length/2;
		int left[]=desending(Arrays.copyOfRange(are,0,mid));
		int right[]=desending(Arrays.copyOfRange(are,mid,are.length));
		return con(left,right);
	}
	int[] con(int left[],int right[])
	{
		int i=0,j=0,k=0;
		int newarr[]=new int[left.length+right.length];
		while(i<left.length && j<right.length)
		{
			if(left[i]>right[j])
			{
				newarr[k]=left[i];
				i++;
				k++;
			}
			else
			{
				newarr[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<left.length)
		{
			newarr[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			newarr[k]=right[j];
			j++;
			k++;
		}
		return newarr;
	}
	int median(int ar[])
	{
		
		int mid=ar.length/2;
		return mid;
	}
	void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}