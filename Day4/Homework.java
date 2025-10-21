package Day4;
import java.util.*;
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Role id: ");
		int role = input.nextInt();
		if(role == 3) {
			System.out.println("Welcome Guest. View-only access.");
		}
		else if (role == 1 || role == 2){
			input.nextLine();
			System.out.print("Enter the user name: ");
			String username = input.nextLine();
			System.out.print("Enter the Password: ");
			int password = input.nextInt();
			if (username.equals("A") && password == 1234 && role == 1 ) {
				System.out.println("Welcome Admin. Full access granted.");
			}
			else if(username.equals("S") && password == 1111 && role == 2) {
				System.out.println("Welcome Student. Limited access granted.");
			}
			else {
				System.out.println("Invalid credentials or role.");
			}
		}
		else {
			System.out.println("Invalid credentials or role.");
		}
	}
}	

