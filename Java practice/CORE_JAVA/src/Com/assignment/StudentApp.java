package Com.assignment;

public class StudentApp {

	public static void main(String[] args) {
		Student s = new Student();
		s.setStudentId(101);
		s.setStudentName("Rahul");
		s.setCourse("Java Full Stack");
		s.setPercentage(88.5);
		System.out.println("Student Details");
		System.out.println("-----------------");
		System.out.println("Student Id :"+s.getStudentId());
		System.out.println("Student Name :"+s.getStudentName());
		System.out.println("Course :"+s.getCourse());
		System.out.println("Percentage :"+s.getPercentage());
		System.out.println("");

	}

}
