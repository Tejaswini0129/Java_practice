package Package2;

public class Employee {
	String employeeName;
	double basicSalary;
	public void setemployeeName(String Name) {
		employeeName = Name;
	}
	public void setbasicSalary(double Salary) {
		basicSalary = Salary;
	}
	public String getemployeeName() {
		return employeeName;
	}
	public double getbasicSalary() {
		return basicSalary;
	}
	public double calculateHRA() {
		return  basicSalary *20/100;
	}
	public double calculateDA() {
		return basicSalary * 10/100;
	}
	public double calculateGrossSalary() {
		return basicSalary + calculateHRA() + calculateDA();
	}
	public String displaySalaryDetalis() {
		return ("Enter Employee Name :" + getemployeeName()+ " "+"Enter Basic Salary :"+getbasicSalary()+" "+ "Employee Salary Report\n"
				+"Employee Name:" + getemployeeName()+" "+"Basic Salary :"+getbasicSalary()+ " "+"HRA :"+calculateHRA()+" "+"DA :"+calculateDA()
				+ "Gross Salary :"+ calculateGrossSalary());
	}
}
//	static String comanyName = "Infosys";
//    int employeeId = 125;
//    String employeeNameName;
//	
//    public static void companyInfo() {
//	   System.out.println("CompanyName:"+ "companyName");
//   }
//	public void employeeInfo() {
//		System.out.println("EmployeeName :"+ "Ram");
//		System.out.println("EmployeeID :"+1001);
//		
//	}
// 
//	public static void main(String[] args){
//		
//	Employee emp1 = new Employee();
//	companyInfo();
//	emp1.employeeInfo();
//	
//	}
//}