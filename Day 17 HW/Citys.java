import java.util.Scanner;
class Citys
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE ROW VALUES :");
		int r=sc.nextInt();
		System.out.print("ENTER THE COLUMN VALUES :");
		int c=sc.nextInt();
		String a[][]=new String[r][c];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print("ENTER THE CITY NAME "+i +j +":");
			a[i][j]=sc.next();
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