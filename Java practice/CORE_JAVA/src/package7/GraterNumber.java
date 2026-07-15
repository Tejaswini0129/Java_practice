package package7;

public class GraterNumber {
	
	public int findGrater(int num1 ,int num2) {
		if(num1>num2) {
			return num1;
		}else if(num2>num1) {
			return num2;
		}else {
			return  num1;
		}
	}

	public static void main(String[] args) {
		
		GraterNumber obj = new GraterNumber();
		System.out.println("Grater number (10,20) :" + obj.findGrater(10, 20));
	}

}