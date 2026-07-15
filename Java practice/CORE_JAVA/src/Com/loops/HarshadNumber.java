package Com.loops;

public class HarshadNumber {
	
	public int getSum(int num) {
		int sum = 0;
		int temp=num;
	
		while(num != 0) {
			int rem = num%10;
			sum=sum + rem;
			num /=10;
		}
		return sum;
	}
	public boolean isHarshad(int num) {
		return num%getSum(num)==0;
	}

	public static void main(String[] args) {
	 HarshadNumber obj = new HarshadNumber();
		System.out.println(obj.isHarshad(12));

	}

}
