package Com.loops;
import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in)	;
	int units;
	int bill;
	System.out.println("Enter Units Consumed :");
	units = sc.nextInt();
	if (units <= 100) {
		bill = units * 2;
	}else if  (units <= 200){
		bill = units* 3;
	}else {
		bill = units * 5; 
	}
	System.out.println(" Total Bill : ₹" + bill);
 }
}
