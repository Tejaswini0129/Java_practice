package Com.loops;
import java.util.Scanner;

public class Restaurentmenu {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	int choice;
	
	System.out.println("********MENU********");
	System.out.println("1. Pizza ");
	System.out.println("1. Burger ");
	System.out.println("1. Sandwich ");
	System.out.println("1. Coffee ");
	System.out.println("1. Exit ");
	
	System.out.println(" Enter your Choice : ");
	choice = sc.nextInt();
	
	switch(choice) {
	case 1:
		System.out.println("You Selected : Pizza");
		System.out.println("Price : 250");	
		break;
	case 2:
		System.out.println("You Selected : Burger");
		System.out.println("Price : 150");		
		break;
	case 3:
		System.out.println("You Selected : Sandwich");
		System.out.println("Price : 120");		
		break;
	case 4:
		System.out.println("You Selected : Coffee");
		System.out.println("Price : 80");		
		break;
	case 5:	
		System.out.println("Thank You! Visit Again..");
		break;
		
	default:
		System.out.println("Invalid Choice");
		break;
	}

	}

}
