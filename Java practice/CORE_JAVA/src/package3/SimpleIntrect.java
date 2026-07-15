package package3;

public class SimpleIntrect {
	double principal =10000;
	double rate = 5;
	double time =2;
	
	public void calculateSI() {
		double intrest = (principal*rate*time)/100;
		System.out.println("Simple Intrest Details");
		System.out.println("Principal :"+(int) principal);
		System.out.println("Rate :"+ (int)rate);
		System.out.println("Time :"+ (int)time);
		System.out.println("Intrest :"+ intrest);

	}

	public static void main(String[] args) {
		SimpleIntrect obj = new SimpleIntrect();
		obj.calculateSI();

	}

}
