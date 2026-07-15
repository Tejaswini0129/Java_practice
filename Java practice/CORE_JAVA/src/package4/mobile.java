package package4;

public class mobile {
	static String brand="Samsung";//static variable
	String model="S24";           //instance variable
	int price =80000;             //instance variable
	public static void brandInfo() {
		System.out.println("Brand:"+"Samsung");
	}
	public void mobileInfo() {
		System.out.println("Model:"+"S24");
		System.out.println("Price:"+80000);
	}		
    public static void main(String [] args) {
    	mobile obj = new mobile();
    	brandInfo();
    	obj.mobileInfo();
    }
}
