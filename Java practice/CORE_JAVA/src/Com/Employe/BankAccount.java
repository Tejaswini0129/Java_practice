package Com.Employe;

public class BankAccount {
        int accountNumber;
        String accountHolderName;
        double balance;
        
        BankAccount(int accountNumber,String accountHolderName,double balance){
        	this.accountNumber = accountNumber;
        	this.accountHolderName = accountHolderName;
        	this.balance = balance;
        	
        }
        	public int getAccountNumber() {
        		return accountNumber;
        	}
        	public String getAccountHolderName() {
        		return accountHolderName;
        	}
        	public double getBalance() {
        		return balance;
        	}
        	
        	public void setBalance(double balance) {
            	this.balance = balance;
        	}
        	
        	public void deposit(double amount) {
        	     balance =  balance + amount;
        	     
        	     System.out.println("Deposited Amount :"+amount);
        	     System.out.println("Updated balance :"+balance);
        	}
        	
        	public void withdraw(double amount) {
        		if(balance >= amount) {
        			balance = balance - amount;
        			System.out.println("Withdrawl Amount :"+amount);
        			System.out.println("Updated balance :"+balance);
        		}else {
        			System.out.println("Insufficient Balance.");
        		}
        	}
        
        
}
