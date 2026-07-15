package Com.Problems;
import java.util.Scanner;

public class DuckNumber {
	
	public void isDuck(int num) {
		int temp = num;
		boolean duck = false;
		
		while(temp >0) {
		    int rem = temp%10;
		    
		    if(rem==0) {
		    	duck = true;
		    	break;
		    }
		    temp /=10;
		}
		if(duck) {
			System.out.println(num + "is a Duck Number.");
		}else {
			System.out.println(num + "is not a Duck Number.");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		
		DuckNumber obj = new DuckNumber();
		obj.isDuck(num);
		

	}

}
