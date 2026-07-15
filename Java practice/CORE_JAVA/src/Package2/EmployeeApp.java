package Package2;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.setemployeeName("Rahul");
		obj.setbasicSalary(30000);
		//obj.calculateHRA();
		//obj.calculateDA();
		//obj.calculateGrossSalary();
		System.out.println(obj.displaySalaryDetalis());

	}

}
