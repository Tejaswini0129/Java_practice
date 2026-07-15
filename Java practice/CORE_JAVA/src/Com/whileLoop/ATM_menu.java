package Com.whileLoop;
import java.util.Scanner;

public class ATM_menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice;
		double balance=10000;
		double amount;
		
		while(true) {
			System.out.println("********ATM********");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposite Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice :");
			choice= sc.nextInt();
		
			switch(choice) {
			case 1:
				System.out.println("Current balance :"+balance);
			    break;
				
			case 2:
				System.out.println("Enter Deposite Amount :");
				amount= sc.nextDouble();
				
				balance= balance + amount;
				
				System.out.println("Amount Deposited Successfully.");
				System.out.println("Current balance :"+balance);
				break;
				
			case 3:
				System.out.println("Enter Withdraw Amount :");
				amount = sc.nextDouble();
				
				if(amount <= balance) {
				    balance = balance - amount;
	                System.out.println("Amount Withdraw Successfully.");
				    System.out.println("Current Balance :"+balance);
				    
				}else {
					System.out.println("Insufficent Balance.");
				}
				break;
				
			case 4:
				System.out.println("Thank You for Using Our ATM!");
				break;
				
				default:
					System.out.println("Invalid Choice! Please Try Again.");
			}
			      if(choice==4) {
			    	  break;
			      }
		 }
	}
}
