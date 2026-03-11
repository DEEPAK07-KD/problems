class Alphabet
{
	public static void main(String[] args)
	{
		int n=5;
		int i;
		for(i=1;i<=5;i++)
		{
			for(char j='A';j<i+'A';j++)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
} 