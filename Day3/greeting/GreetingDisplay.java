package greeting;
import profile.UserInput;

public class GreetingDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInput out = new UserInput();
		String name = out.pro();
		System.out.println("Welcome "+ name);

	}

}
