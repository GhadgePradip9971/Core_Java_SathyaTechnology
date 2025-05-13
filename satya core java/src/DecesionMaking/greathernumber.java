package DecesionMaking;

import java.util.Scanner;

public class greathernumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.println("Enter the value of a=");
		a = sc.nextInt();
		System.out.println("Enter the value of b=");
		b = sc.nextInt();
		System.out.println("Enter the value of c=");
		c = sc.nextInt();

		if (a > c) {
			if (a > b) {
				System.out.println("A is greather");
			} else {
				System.out.println("b is greather");
			}

		} else {
			System.out.println("c is greatger");
		}

	}

}
