class Star12
{
	public static void main(String[] argu)
	{
		for (int i=5;i>=1;i--)
		{
		
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}
}