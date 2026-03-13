import java.util.Scanner;
class StudentMark
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE ROW VALUE :");
		int r=sc.nextInt();
		System.out.print("ENTER THE COLUMN VALUE :");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print("ENTER STUDENT MARKS "+i+j+":");
			a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print(a[i][j]+" ");
			}
		System.out.println("");
			
		}
	}
}