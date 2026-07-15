package package3;

public class CircleArea {
	
	public static void CalculateCircleArea() {
		int radius=7;
		double AreaOfCircle =3.14*radius*radius;
		System.out.println("Circle Details");
		System.out.println("Radius :"+ radius);
		System.out.println("Area Of Circle :"+ AreaOfCircle);
	}

	public static void main(String[] args) {
	    CircleArea obj = new CircleArea();
	    CalculateCircleArea();

	}

}
