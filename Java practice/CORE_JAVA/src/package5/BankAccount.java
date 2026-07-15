package package5;

public class BankAccount {
       long accountNumber;
       String accountHolderName;
       double balance;
       
       public void setaccountNumber(long AccountNumber) {
    	   accountNumber = AccountNumber;
       }
       public void setaccountHolderName(String AccountHolderName ) {
    	   accountHolderName = accountHolderName;
       }
       public void setbalance(double Balance) {
    	   balance = balance;
       }
       public long getaccountNumber() {
    	   return accountNumber;
       }
       public String getaccountHolderName() {
    	   return accountHolderName;
       }
       public double getbalance() {
    	   return balance;
       }
       public String displayDetails() {
    	   System.out.println("Enter Account Number :"); 	   
    			   return "Account Number :"+getaccountNumber()+ "Account Holder Name :"+getaccountNumber()+ "Balance :"+getbalance();
       }
}
