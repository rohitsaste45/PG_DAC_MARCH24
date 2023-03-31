import java.util.Scanner;
class A6{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int Year =sc.nextInt();
	if((Year%4==0)&&(Year%100==0)&&(Year%400==0))
		System.out.println("The year is Leap");
	else
		System.out.println("This is not Leap Year");
	
	}
}
		