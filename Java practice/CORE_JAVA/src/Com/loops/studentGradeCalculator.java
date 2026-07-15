package Com.loops;
import java.util.Scanner;

public class studentGradeCalculator {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Student Marks :");
	sc.nextInt();
	int marks = 95;
	if((marks >= 90) && (marks <= 100)){
		System.out.println("Grade A");
	}else if((marks >=80) && (marks <= 89)){
		System.out.println("Grade B");
	}else if((marks >= 70) && (marks <= 79)){
		System.out.println("Grade C");
	}else if((marks >=60) && (marks <= 69)) {
		System.out.println("Grade D");
	}else if((marks >= 0) && (marks <=60)) {
		System.out.println("Fail");
	}else {
		System.out.println("Invalid");
	}
  }
}