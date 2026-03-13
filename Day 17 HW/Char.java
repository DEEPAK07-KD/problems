class Char
{
	public static void main(String[] args)
	{
		char a[][]={{'D','E','E','P','A'},
					{'K','R','A','J','A'},
					{'B','A','C','K','I'},
					{'Y','A','R','A','J'}};
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