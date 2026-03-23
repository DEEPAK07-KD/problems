import java.util.Scanner;
class Employees
{
	Scanner sc=new Scanner(System.in);
	boolean result=true;
	public static void main(String args[])
	{
		
		Employees emp=new Employees();
		emp.main();
	}
	void main()
	{
		Scanner se=new Scanner(System.in);
		System.out.print("ENTER THE ARRAY SIZE : ");
		int size=se.nextInt();
		int ar[]=new int[size];
	do{
		System.out.println("******************************************");
		System.out.println("         EMPLOYEES IDENTIFICATION         ");
		System.out.println("******************************************");
		System.out.println("1.ADD EMPLOYEE ID");
		System.out.println("2.REMOVE EMPLOYEE ID");
		System.out.println("3.DISPLAY EMPLOYEE ID's");
		System.out.println("4.EXIT");
		System.out.print("CHOOSE YOUR OPTIONS : ");
		int op=sc.nextInt();
		if(op==1)
		{
			insert(ar);
		}
		else if(op==2)
		{
			ar=remove(ar);
		}
		else if(op==3)
		{
			display(ar);
		}
		else
		{
			result=false;
			System.out.println("THE PROGRAMM IS EXITED");
		}
	}while(result);
	}
	void insert(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
		System.out.print("ENTER THE EMPLOYEES ID'S : ");
		arr[i]=sc.nextInt();
		}
		System.out.println("EMPLOYEE ID's ADDED SUCCESSFULLY");
	}
	void display(int a[])
	{
		
		System.out.println("EMPLOYEES ID'S :");
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]+" ");
		}
	}
	//void remove(int are[])
	int[] remove(int are[])
	{
		int posi=2;
		
		int newar[]=new int[are.length-1];
		for(int i=0;i<posi-1;i++)
		{
			newar[i]=are[i];
		}
		for(int i=posi-1;i<newar.length;i++)
		{
			newar[i]=are[i+1];
		}
		System.out.println("REMOVED SUCCESSFULLY");
		return newar;
	}
}