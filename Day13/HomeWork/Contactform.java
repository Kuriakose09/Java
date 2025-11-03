import java.util.*;
import java.util.regex.*;

public class Contactform {
	public static void Namechecker(String name) {
		Pattern patt = Pattern.compile("^[A-Z][a-z]*(\\s+[A-Z][a-z]*)*$");
		Matcher match = patt.matcher(name);
		if(match.find()) {
			System.out.println("Valid Name");
		}
		else {
			System.out.println("Not a valid Name");
		}
	}
	public static void EmailChecker(String email) {
		Pattern patt = Pattern.compile("^[a-z0-9]+@[a-z]+\\.[a-z]+$");
		Matcher match = patt.matcher(email);
		if(match.find()) {
			System.out.println("Valid Email");
		}
		else {
			System.out.println("Not a valid Email");
		}
	}
	public static void phoneChecker(String phone) {
		Pattern patt = Pattern.compile("\\d{10}");
		Matcher match = patt.matcher(phone);
		if(match.matches()) {
			System.out.println("Valid Phone");
		}
		else {
			System.out.println("Not a valid Phone");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the full name:");
		String name = input.nextLine();
		System.out.print("Enter the Email:");
		String Email = input.nextLine();
		System.out.print("Enter the Phone Number:");
		String phone = input.nextLine();
		Namechecker(name);
		EmailChecker(Email);
		phoneChecker(phone);
	}

}
