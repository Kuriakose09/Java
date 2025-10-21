package Day4;
import java.util.*;
public class Classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the username:");
		String uname = input.nextLine();
		System.out.print("Enter the Password:");
		String pass = input.nextLine();
		String username= "admin";
		String password= "java123";
		if (uname.equals(username)) {
			if(pass.equals(password)) {
				System.out.println("Login Successful");
			}
			else {
				System.out.println("Access Denied");
			}
		}
		else {
			System.out.println("Access Denied");
		}
	}

}
