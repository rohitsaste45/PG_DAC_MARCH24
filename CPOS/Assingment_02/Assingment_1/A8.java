import java.util.Scanner;
class A8{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("The digits are from right to left:");
		for(;num>0;num/=10)
		{
			System.out.println(num%10);
		}
		
	}
}
	
	