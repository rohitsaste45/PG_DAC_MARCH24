class Patt7{

	public static void main(String[]argu)
		{	
			for(int i=1;i<=4;i++)
			{
				for(int j=3;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(k+" ");
				}
				System.out.println();
			}
		}
}