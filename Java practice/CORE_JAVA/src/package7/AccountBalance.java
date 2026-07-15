package package7;
import java.util.Scanner;

public class AccountBalance {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance, withdraw;
        System.out.println("Enter Account Balance : ");
        balance =sc.nextInt();
        System.out.println("Enter Withdrawal Amount : ");
        withdraw = sc.nextInt();
        
        if(withdraw <= balance) {
        	balance = balance - withdraw;
            System.out.println("Transaction Successful ");
            System.out.println("Remaining Balance : "+ balance);
	}else {
		 System.out.println("Insufficient Balance ");
	}
	}
}
