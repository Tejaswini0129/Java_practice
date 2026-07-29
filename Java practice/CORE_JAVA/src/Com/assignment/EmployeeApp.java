package Com.assignment;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setempId(1001);
		emp.setempName("Ravi");
		emp.setempDept("Development");
		emp.setsalary(45000.0);
		
		System.out.println("Employee Details");
		System.out.println("-------------------");
		System.out.println("Employee ID :"+emp.getempId());
		System.out.println("Employee name :"+emp.getempName());
		System.out.println("Department :"+emp.getempDept());
		System.out.println("Salary :"+emp.getsalary());

	}

}
