class Patt10
{
	public static void main (String[]argu)
	{
		for(char i='E';i>='A';i--)
		{
			for(char j='A';j<i;j++)
			{	
				System.out.print(" ");
			}
			for(char k='E';k>=i;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}