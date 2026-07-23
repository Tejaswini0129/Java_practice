package Com.Employe;

public class BankProcesser {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount(123456, "Srinu", 6000.0);
		System.out.println("Account Number :"+obj.getAccountNumber());
		System.out.println("Account Holder Name :"+ obj.getAccountHolderName());
        System.out.println("Current Balance :"+obj.getBalance());
		
		System.out.println("After Amount" );
		
		obj.deposit(3000);
		System.out.println("After withdraw");
		
		obj.withdraw(4000);
			
		


	}

}
