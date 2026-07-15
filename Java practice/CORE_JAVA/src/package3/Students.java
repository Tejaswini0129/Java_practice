package package3;

public class Students{
	static String collageName;//static variable
	String studentName;      //instance variable
	int rollNo;              //instance variable
	public static void school() {
		System.out.println("SchoolName:"+"Vasavi school");
	}
	public void studentData() {
		System.out.println("StudentName:"+"Tejaswini");
		System.out.println("Rollno:"+20);
	}
	public static void main(String [] args) {
		int marks = 100;                      //local variable
		Students obj = new Students();
		obj.school();
		obj.studentData();
		System.out.println("Marks :"+marks);
	}
}
	
	//public static void main(String[] args) {
	//	String StudentName="Tejaswini";
	//    int StudentAge=15;
	//	float StudentPercentage=85.00f;
		//double EmployeeSalary=7000000.00;
		//boolean IsPassed=true;
		
		
	//	int age123 = 20;       // 123age is invalid cannot start with digit
	//	double employeeSalary = 25000;   // employee-salary is invalid cannot use hyphens
	//	boolean Class = true;    //cannot use keywords
	//	char grade = 'A';        // it is valid

		
	//		System.out.println("Corrected Age:"+age123);
	//		System.out.println("Corrected salary:"+employeeSalary);
	//		System.out.println("Corrected Class status"+Class);
	//		System.out.println("Corrected grade:"+grade);
			
	//}			
		
	


