import java.util.Scanner;
class A4{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int num =sc.nextInt();
	int fact=my_recursion(num);
	System.out.println(fact);
	}
	
	public static int my_recursion(int num)
	{
		if(num>=1)
			return num*my_recursion(num-1);
		else 
			return 1;
	}
}
	