package DecesionMaking;

import java.util.Scanner;

public class Loginform {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String username, password, name, pass;
		System.out.println("Register your account!!!!");

		System.out.println("Enter your name=");
		name = sc.next();
		System.out.println("Enter password=");
		pass = sc.next();
		System.out.println("you are account created succesfully!!!!");

		System.out.println("Enter your user name =");
		username = sc.next();
		System.out.println("Enter your password=");
		password = sc.next();

		if (name.equals(username)) {
			if (pass.equals(password)) {
				System.out.println("you are logged in succesfull!!!!!!!");
			} else {
				System.out.println("you are password is wrong ");
			}

		} else {
			if (pass.equals(password)) {
				System.out.println(" check username");
			} else {
				System.out.println("check you are credentials!!!!!!");
			}
		}

	}

}
