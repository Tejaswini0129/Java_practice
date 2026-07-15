package package7;
import java.util.Scanner;

public class LoginAuthentication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Username,Passward;
		System.out.println("Enter Username :");
		Username = sc.nextLine();
		System.out.println("Enter Passward :");
		Passward = sc.nextLine();
		
		if (Username.equals("admin") && (Passward.equals("1234"))) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Invalid Username or Passward");
		}
	}

}
