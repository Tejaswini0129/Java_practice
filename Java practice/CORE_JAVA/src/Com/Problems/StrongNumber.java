package Com.Problems;
import java.util.Scanner;

public class StrongNumber {
	
	public int getFactorial(int num) {
		
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		return fact;
		
	}
	
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StrongNumber obj = new StrongNumber();
		
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		
		int temp = num;
		int sum = 0;
		while(num>0) {
			int degit = num%10;
			sum=sum+obj.getFactorial(degit);
			num /=10;
		}
		
		if(sum==temp) {
			System.out.println(temp + "is a Strong Number.");
		}else {
			System.out.println(temp + "is not a Strong Number");
		}
		

	}

}
