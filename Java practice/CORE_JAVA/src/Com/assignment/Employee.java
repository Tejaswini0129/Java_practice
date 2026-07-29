package Com.assignment;

public class Employee {
	private int empId;
	private String empName;
	private String empDept;
	private double salary;
	
	public void setempId(int empId) {
		this.empId = empId;
	}
	public void setempName(String empName) {
		this.empName = empName;
	}
	public void setempDept(String empDept) {
		this.empDept = empDept;
	}
	public void setsalary(double salary) {
		this.salary = salary;
	}
	
	public int getempId() {
		return empId;
	}
	public String getempName() {
		return empName;
	}
	public String getempDept() {
		return empDept;
	}
	public double getsalary() {
		return salary;
	}

}
