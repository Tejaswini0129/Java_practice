package Com.assignment;

public class BankApp {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		
		bank.setAccNumber(123456789);
		bank.setAccHolderName("Priya");
		bank.setBalance(50000.0);
		System.out.println("Bank Account Details");
		System.out.println("-----------------------");
		System.out.println("Account Number :"+bank.getAccNumber());
		System.out.println("Account Holder Name :"+bank.getAccHolderName());
		System.out.println("Balance :"+bank.getBalance());

	}

}
