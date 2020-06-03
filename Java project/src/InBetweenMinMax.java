import java.util.Scanner;

public class InBetweenMinMax {
	int num1,num2;
    Scanner sc;
    
    InBetweenMinMax() {
		sc = new Scanner(System.in);
				
	}
	void printInBetweenValues() {
		
		if(num1 == num2)
			System.out.println("Invalid");
		else 
			for(int i=num1+1; i<num2; i++)
			{
				System.out.println(i);
			}
	}
	void takeTwoNumberInput() {
		System.out.println("Please enter the Min number");
		num1 = sc.nextInt();
		System.out.println("Please enter the Max number");
		num2 = sc.nextInt();
		
	}

	public static void main(String[] args) {
		InBetweenMinMax ibm = new InBetweenMinMax();
		ibm.takeTwoNumberInput();
		ibm.printInBetweenValues();
	}

}
	
	
	


	


