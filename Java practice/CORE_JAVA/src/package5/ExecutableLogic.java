package package5;

public class ExecutableLogic {

	public static void main(String[] args) {
		bisinessLogic obj1 = new bisinessLogic();
		bisinessLogic p1= new bisinessLogic();
		obj1.setproductId(1);
		obj1.setproductName("Watch");
		obj1.setprice(2000.00);
		obj1.setquantity(3);
		System.out.println(obj1.displayDetails());

	}

}
