package Arrays;

import java.util.Scanner;

public class Replaceelement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 11, 32, 45, 22, 67 };
		int selement, i, n, relement;
		System.out.println("Enter the sourceelement and replace elemnet");
		selement = sc.nextInt();
		relement = sc.nextInt();

		for (i = 0; i < a.length; i++) {
			if (selement == a[i])
				a[i] = relement;

		}
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}

	}

}
