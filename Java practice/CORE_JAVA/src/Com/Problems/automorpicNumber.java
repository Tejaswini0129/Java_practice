package Com.Problems;
import java.util.Scanner;

public class automorpicNumber {
	
	public void isAutomorpic(int num) {
		int temp=num;
		int square = num*num;
		
		while(temp>0) {
			if(temp%10 != square%10) {
				System.out.println("is Not Autpmorpic Number.");
				return;
			}
			
			temp /=10;
			square /=10;
		}
		System.out.println("is Automorpic Number.");
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		
		automorpicNumber obj = new automorpicNumber();
		obj.isAutomorpic(num);
	}

}
