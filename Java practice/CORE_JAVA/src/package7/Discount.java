package package7;
import java.util.Scanner;

public class Discount {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		
		double Bill , discount =0, finalBill;
		
		System.out.println("Enter Bill Amount :");
		Bill =sc.nextDouble();
		 if (Bill > 5000) {
	            discount = Bill * 0.20;
	        } else if (Bill >= 3000 && Bill <= 5000) {
	            discount = Bill * 0.10;
	        } else {
	            discount = 0;
	        }
		 finalBill = Bill - discount;
		 System.out.println("Original Bill : " + Bill);
	     System.out.println("Discount : " + discount);
	     System.out.println("Final Bill : " + finalBill);
         sc.close();
	}
	}

