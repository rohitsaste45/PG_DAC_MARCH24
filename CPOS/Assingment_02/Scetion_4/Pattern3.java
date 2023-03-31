class Pattern3{

	public static void main(String[]argu)
		{	
			for(int i=6;i>=1;i--)
			{
				
				for(int k=1;k<=i;k++)
				{	
					if(i==6||k==1||k==i)
					System.out.print("* ");
					else
					System.out.print("  ");						
				}
				System.out.println();
			}
		}
}