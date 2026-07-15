package package5;

public class BankApplication {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		obj.setaccountNumber(8765);
		obj.setaccountHolderName("Teju");
		obj.setbalance(50000);
		System.out.println(obj.displayDetails());

	}

}
