package package3;

public class StudentApp {
	public static void main(String [] args) {
	student st = new student();
	st.setstudentName("Ravi");
	st.setjavaMarks(90);
	st.setsqlMarks(85);
	st.setwebMarks(95);
	st.calculateTotal();
	st.calculatePercentage();
	System.out.println(st.displayStudentDetails());

  }
}