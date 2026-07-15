package Com.Operators;
import java.util.Scanner;

public class BitwiseOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter Number :");
		num = sc.nextInt();
		System.out.println("Original Number :" + num);
		System.out.println("Complete Result :"+(~num));
	}
}





//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num,shiftnum;
//		System.out.println("Enter First Number :");
//		num = sc.nextInt();
//		System.out.println("Enter Shift Number :");
//		shiftnum = sc.nextInt();
//		System.out.println("Result After Left Shift :" +(num>>shiftnum));
//  }
//}





//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num1,num2;
//		
//		System.out.println("Enter First Number :");
//		num1 = sc.nextInt();
//		System.out.println("Enter Second Number :");
//		num2 = sc.nextInt();
//		System.out.println("Bitwise AND :"+(num1&num2));
//		System.out.println("Bitwise OR :"+(num1|num2));
//		System.out.println("Bitwise XOR :"+(num1^num2));
//		}
//}
