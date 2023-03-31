import java.util.Scanner;
class A1{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("The Enter number");
		int num =sc.nextInt();
		if(num%2==0)
		System.out.println("The Enter number is Even ");
		else
			System.out.println("The Enter number is odd");
	}
}