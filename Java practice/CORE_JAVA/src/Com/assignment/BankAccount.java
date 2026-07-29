package Com.assignment;

public class BankAccount {
	private int accNumber;
	private String accHolderName;
	private double balance;
	
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getAccNumber() {
		return accNumber;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public double getBalance() {
		return balance;
	}


}
