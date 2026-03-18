import java.util.Scanner;
class StudentMark1
{
		int total=0;
		int avg=0;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		StudentMark1 sm=new StudentMark1();
		sm.main();
	}
	void main()
	{
		System.out.print("ENTER THE SUBJECT SIZE : ");
		int size=sc.nextInt();
		int ar[]=new int[size];
		boolean result=true;
	do
	{
		System.out.println("************************************");
		System.out.println("     STUDENT MARK SYSTEM            ");
		System.out.println("************************************");
		System.out.println("1.ENTER MARKS");
		System.out.println("2.CALCULATE TOTAL");
		System.out.println("3.CALCULATE AVERAGE");
		System.out.println("4.FIND GRADE");
		System.out.println("5.EXIT");
		System.out.print("CHOOSE YOUR OPTION : ");
		int op=sc.nextInt();
		if(op==1)
		{
			marks(ar);
		}
		else if(op==2)
		{
			total(ar);
		}
		else if(op==3)
		{
			average(ar);
		}
		else if(op==4)
		{
			grade(ar);
		}
		else
		{
			result=false;
		}
	}while(result);
	}
	void marks(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print("ENTER THE VALUE OF "+ i +" MARKS : ");
			a[i]=sc.nextInt();
		}
	}
	void total(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			total+=a[i];
		}
		System.out.println("THE ALL SUBJECT TOTAL IS : "+total);
	}
	void average(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			total+=a[i];
			avg=total/a[i];
			
		}
		System.out.println("THE AVERAGE OF TOTAL MARKS : "+avg);
	}
	void grade(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			total+=a[i];
			avg=total/a[i];
		}
		if(avg>=90)
		{
			System.out.println("GRADE A");
		}
		else if(avg>=75)
		{
			System.out.println("GRADE B");
		}
		else if(avg >= 50)
		{
			System.out.println("GRADE C");
		}
		else
		{
			System.out.println("YOU ARE FAILED");
		}
	}
}