package package7;
import java.util.Scanner;

public class BonusCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary ,bonus,totalSalary ;
		System.out.println("Enter Employee Salary :");
		salary = sc.nextDouble();
		if(salary >50000) {
			bonus = salary * (0.15);
		}else if ((salary >= 30000) && (salary <= 50000)) {
			bonus = salary * (0.10);
			}else if ((salary <30000) && (salary>0)){
				bonus = salary * (0.05);
			}else {
				bonus =0;
			}
	     totalSalary = salary + bonus;
		
		System.out.println("Salary :"+ salary);
		System.out.println("Bonus :"+ bonus);
		System.out.println("Total Salary :"+ (salary+ bonus));
		sc.close();
		}

	}


