import java.util.Scanner;
class MaxMin
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE ARRAY SIZE : ");
		int si=sc.nextInt();
		int a[]=new int[si];
		int max=0;
		
		int sum=0;
		boolean result=true;
		for(int i=0;i<a.length;i++)
		{
			System.out.print("ENTER THE INDEX OF "+ i +" VALUE IS : ");
			a[i]=sc.nextInt();
		}
		int min=a[0];
		do{
			System.out.println("************************************************************");
			System.out.println("         FINDING THE MAXIMUM AND MINIMUM VALUE              ");
			System.out.println("************************************************************");
			System.out.println("1.MAXVALUE");
			System.out.println("2.MINIMUM ");
			System.out.println("3.SUM");
			System.out.println("4.EXIT");
			System.out.print("CHOOSE THE OPTION :");
			int op=sc.nextInt();
			if(op==1)
			{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>max)
				{
					max=a[i];
				}
			}
				System.out.println("THE MAXIMUM VALUE IS : "+max);
			}
			else if(op==2)
			{
				//int min=a[0];
				for(int i=0;i<a.length;i++)
				{
					if(a[i]<min)
					{
						min=a[i];
					}
				}
				System.out.println("THE MINIMUM VALUE IS : "+min);
			}
			else if(op==3)
			{
				for(int i=0;i<a.length;i++)
				{
					sum+=a[i];
				}
				System.out.println("THE SUM OF THE ARRAY IS : "+sum);
			}
			else
			{
				result=false;
			}
		}while(result);
	}
}