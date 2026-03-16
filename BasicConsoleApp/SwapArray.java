import java.util.Scanner;
class SwapArray
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("ENTER THE ARRAY SIZE : ");
	int si=sc.nextInt();
	int ar[]=new int[si];
	for(int i=0;i<ar.length;i++)
	{
		System.out.print("ENTER THE INDEX OF "+ i +" VALUE IS : ");
		ar[i]=sc.nextInt();
	}
	int count=0;
	boolean result=true;
		do
		{
			System.out.println("*****************************************");
			System.out.println("    THE REVERSE NUMBER USING SWAPING     ");
			System.out.println("*****************************************");
			System.out.println("1.REVERSE");
			System.out.println("2.REVERSE USING SWAPING");
			System.out.println("3.PRINT ONLY EVEN NUMBERS");
			System.out.println("4.PRINT ONLY DIVISIBLE BY 7 NUMBER");
			System.out.println("5.COUNT OF TOTAL LENGTH");
			System.out.println("6.EXIT");
			System.out.print("CHOOSE YOUR OPTION : ");
			int op=sc.nextInt();
			if(op==1)
			{
				for(int i=ar.length-1;i>=0;i--)
				{
					System.out.println("THE NORMAL REVERSE IS : "+ar[i]);
					
				}
			}
			else if(op==2)
			{
				for(int i=0;i<ar.length/2;i++)
				{
					int t=ar[i];
					int b=ar.length-1-i;
					ar[i]=ar[b];
					ar[b]=t;
				}
				for(int i=0;i<ar.length;i++)
				{
				System.out.println(ar[i]+" ");
				}
			}
			else if(op==3)
			{
				for(int i=0;i<ar.length;i++)
				{
					if(ar[i]%2==0)
					{
						System.out.println("THE EVEN NUMBERS IS : "+ar[i]);
					}
				}
			}
			else if(op==4)
			{
				for(int i=0;i<ar.length;i++)
				{
					if(ar[i]%7==0)
					{
						System.out.println("THE DIVISIABLE BY 7 NUMBERS IS : "+ar[i]);
					}
				}
			}
			else if(op==5)
			{
				for(int i=0;i<ar.length;i++)
				{
					count++;
				}
				System.out.println("THE COUNTING LENGTH IS : "+count);
			}
			else
			{
				result=false;
			}
		}while(result);
	}
}