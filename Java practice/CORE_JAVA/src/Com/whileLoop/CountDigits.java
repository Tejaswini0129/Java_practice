package Com.whileLoop;
import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int i = sc.nextInt();
		
		int count = 0;
		while(i>0) {
			count++;
			i /= 10;
		}
         System.out.println("Total Digits :" +count);
	}

}
