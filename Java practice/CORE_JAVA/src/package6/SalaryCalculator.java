package package6;

public class SalaryCalculator {

	public static void main(String[] args) {
		int basicSalary = 40000;
		int hra = 6000;
		int da = 4000;
		
		int grossSalary = basicSalary + hra + da;
		System.out.println("Gross Salary :"+ grossSalary);
		System.out.println("Gross Salary > 50000 :"+ (grossSalary > 50000));
		grossSalary += 5000;
		System.out.println("Updated Gross Salary :"+ grossSalary);

		

	}

}
