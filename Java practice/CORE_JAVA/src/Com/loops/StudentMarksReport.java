package Com.loops;
import java.util.Scanner;

public class StudentMarksReport {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		double average;
		
		for(int i=1; i<=5;i++) {
            System.out.println("Enter Marks of Subject"+i+ ":");
            int marks = sc.nextInt();
            total = total + marks;
		}
		average = total/5.0;
		System.out.println("Total Marks :"+total);
		System.out.println("Average marks :"+average);

	}

}
