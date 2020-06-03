//
//import java.util.Scanner;
//
//public class PrimeNumber {
//	int num;
//    Scanner sc;
//    
//    PrimeNumber() {
//		sc = new Scanner(System.in);
//				
//	}
//	void printPrimeNumber() {
//		
//		if(num == 2)
//			System.out.println("Prime Number");
//		
//		else 
//			for(int i=2;i<=num/2;i++)
//			{
//				System.out.println("Not Prime Number");
//			}
//	}
//	void takeTwoNumberInput() {
//		System.out.println("Please enter the Prime number");
//		num = sc.nextInt();
//		
//	}
//
//	public static void main(String[] args) {
//		PrimeNumber pm = new PrimeNumber();
//		pm.takeTwoNumberInput();
//		pm.printPrimeNumber();
//	}
//
//}
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
	int temp;
	boolean isPrime=true;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Number");
	int num=scan.nextInt();
	scan.close();
	for(int i=2;i<=num/2;i++)
	{
		temp= num%i;
		
		if(temp==0)
		{
			isPrime=false;
			break;
		}
		if(isPrime)
			System.out.println(num+"is aPrime Number");
		else
			System.out.println(num+"is not a prime number");
		}
	
	}
	
		
}