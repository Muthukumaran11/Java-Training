import java.util.Scanner;

public class UserInputExample {
	int num1,num2;
	Scanner sc;
	
	UserInputExample() {
		sc = new Scanner(System.in);
				
	}
	void findAndPrintGreatest() {
		if(num1 == num2)
			System.out.println("Both are Equal");
		else if(num1>num2)
		System.out.println("Number1 is Greater");
		else
		System.out.println("Number2 is Greater");
	}
	void takeTwoNumberInput() {
		System.out.println("Please enter the first number");
		num1 = sc.nextInt();
		System.out.println("Please enter the second number");
		num2 = sc.nextInt();
		
	}

	public static void main(String[] args) {
		UserInputExample uie = new UserInputExample();
		uie.takeTwoNumberInput();
		uie.findAndPrintGreatest();
	}

}
