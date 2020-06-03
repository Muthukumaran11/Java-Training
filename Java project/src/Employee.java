
public class Employee {

	int id,age;
	String name;
	
	Employee() {
		id = 101;
		name = "Ramu";
		age = 20;
	}
	
	boolean employeeAgeCheck() {
		
		boolean result=false;
		if(age>=18)
		{
			System.out.println("You Can Join");
			result = true;
		}
		else
			System.out.println("YOu are under age of employment");
		return result;
	}
	void printEmployeeData() {
		System.out.println("Employee Id : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Age : "+age);
		}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		//boolean checkResult = e1.employeeAgeCheck();
		e1.id = 02;
		e1.name = "ramesh";
		e1.age = 23;
		if( e1.employeeAgeCheck() == true)
			e1.printEmployeeData();
			
	}

}

