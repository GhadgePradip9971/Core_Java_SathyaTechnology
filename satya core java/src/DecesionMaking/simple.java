package DecesionMaking;

import java.util.Scanner;

public class simple {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// simple if
		System.out.println("Enter number a=");
		int a = sc.nextInt();

		if (a % 2 == 1) {
			System.out.println("the given number is odd number");
		} else {
			System.out.println("the given number is even");
		}
	}
}
