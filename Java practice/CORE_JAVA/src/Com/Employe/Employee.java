package Com.Employe;

public class Employee {
	
	int employeeId;
	String employeeName;
	String empDesg;
	double salary;
	int performanceRating;
	
	public Employee(int employeeId,String employeeName,String empDesg,double salary,int performanceRating) {
		this.employeeId =employeeId;
		this.employeeName = employeeName;
		this.empDesg = empDesg;
		this.salary = salary;
		this.performanceRating = performanceRating;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public double getSalary(){
		return salary;
	}
	public int getPerformanceRating() {
		return performanceRating;
	}
	
	public void setEmpDesg() {
		this.empDesg = empDesg;
	}
	public void setSalary() {
		this.salary = salary;
		
	}
	
	public void promoteEmployee() {
		
		if (performanceRating >=4) {
			salary = salary + (salary *20/100);
			empDesg = "senior"+" "+empDesg;
			
			System.out.println("After Promotion");
			System.out.println("----------------");
			System.out.println("New Designation :"+empDesg);
			System.out.println("Updated Salary :"+salary);
			
		}else {
			System.out.println("No Promotion");
		}
	}

}
