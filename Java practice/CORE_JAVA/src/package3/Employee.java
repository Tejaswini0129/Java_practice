package package3;

public class Employee {
	static int basicSalary;
	static int hra;
	static int da;
	
	public static void salaryDetails() {
		 basicSalary = 30000;
		 hra = 5000;
		 da = 3000;
	}
	public static void grossSalary() {
        int grossSalary = basicSalary + hra + da;

		System.out.println("******Employee Details******");
		System.out.println("Basic Salary :"+basicSalary);
		System.out.println("HRA :"+hra);
		System.out.println("DA :"+da);
		System.out.println("Gross Salary :"+grossSalary);
		
	}

	public static void main(String[] args) {
		Employee obj = new Employee();
		salaryDetails();
		grossSalary();

	}

}
