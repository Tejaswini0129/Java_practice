package Com.Problems;
import java.util.Scanner;

public class Neon {
	
	public boolean isneon(int num) {
		int temp = num;
		int square = num*num;
		int sum = 0;
		while(square !=0) {
			int rem = square%10;
			sum = sum + rem;
			square /=10;
		}
		return sum == temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		Neon obj = new Neon();
		
		if(obj.isneon(num)) {
			System.out.println(num +" is a Neon Number.");
		}else {
			System.out.println(num +" is not Neon Number.");

		}

	}

}
