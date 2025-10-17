import java.util.Scanner;
public class WelcomeForm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = input.nextLine();
		System.out.print("Enter your age:");
		double age = input.nextDouble();
		System.out.println("Welcome "+name);
		System.out.println("Age:"+age);
	}
}