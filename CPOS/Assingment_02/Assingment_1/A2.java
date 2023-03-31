import java.util.Scanner;
class A2{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("The Enter number");
		int num =sc.nextInt();
		int fact=1;
		for(int i=1;i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial of number is :"+fact);
	}
}