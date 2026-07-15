package Com.loops;

public class isUgly {
	
	public boolean Ugly(int num) {
		if(num<=0) {
			return false;
		}
		while(num%2==0) {
			num=num/2;
		}
		while(num%3==0) {
			num=num/3;
		}
		while(num%5==0) {
			num=num/5;
		}
		return num==1;
	}

	public static void main(String[] args) {
		isUgly obj = new isUgly();
		System.out.println(obj.Ugly(15) ? "is Ugly" :"! Ugly");

	}
	

}
