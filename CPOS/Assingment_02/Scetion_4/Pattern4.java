class Pattern4{

	public static void main(String[]argu)
		{	
			for(int i=1;i<=6;i++)
			{
				for(int j=5;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
			}
		}
}