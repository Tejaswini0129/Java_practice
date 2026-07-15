package Com.loops;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		char op;
		
		System.out.println("Enter First Number :");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second Number :");
		num2 = sc.nextInt();
		
		System.out.println("Enter operator(+,-,*,/,%) :");
		op = sc.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println("Result :"+(num1+num2));
			break;
		case '-':
			System.out.println("Result :"+(num1-num2));
			break;
		case '*':
			System.out.println("Result :"+(num1*num2));
			break;
		case '/':
			if(num2 !=0) {
			System.out.println("Result :"+(num1%num2));
			}else {
				System.out.println("invalid :");
			}break;
		default :
			System.out.println("Invalid Operator");
			}

	}

}
