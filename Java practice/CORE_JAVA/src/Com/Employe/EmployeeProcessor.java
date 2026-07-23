package Com.Employe;

public class EmployeeProcessor {
	
	public static void main(String [] args) {
		Employee obj = new Employee(201,"Bob","Developer",50000.0,5);
		System.out.println("Before Promotion");
		System.out.println("Employee Id :"+obj.getEmployeeId());
		System.out.println("Name :"+obj.getEmployeeName());
		System.out.println("Designation :"+obj.getEmpDesg());
		System.out.println("Salary : "+obj.getSalary());
		System.out.println("Performance Rating :"+obj.getPerformanceRating());
		
		obj.promoteEmployee();
		
		
	}


}
