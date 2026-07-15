package package3;

public class ElectricityBill {
	int units;
	 static int costPerunit=8;
	 
	public void unitDetails() {
		units =250;
	}
	
	public static void calculateBill(ElectricityBill obj) {
		int totalBill = obj.units * costPerunit;
		System.out.println("*****Electricity Bill***** ");
		System.out.println("Units Consumed:"+obj.units);
		System.out.println("Cost Per Unit :"+costPerunit);
	System.out.println("Total Bill :"+totalBill);
	}
   public static void main(String [] args) {
	   ElectricityBill obj = new ElectricityBill();
	  obj. unitDetails();
	   calculateBill(obj);
	   
   }
}

