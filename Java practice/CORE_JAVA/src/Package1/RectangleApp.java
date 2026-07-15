package Package1;

public class RectangleApp {
	
	public static void main(String [] args) {
	Rectangle obj = new Rectangle();
    //obj.setlength(20);
	//obj.setbreadth(10);
	//System.out.println("Enter Length :10");

	//System.out.println("Enter Breadth : 5");
	obj.setlength(10);
	obj.setbreadth(5);
	obj.calculateArea();
	obj.calculatePerimeter();
	System.out.println(obj.displayRectangleDetails());

}
}
