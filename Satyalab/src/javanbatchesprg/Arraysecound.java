package javanbatchesprg;

import java.util.Scanner;

public class Arraysecound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[20];
		int i, n, opos = 0;

		System.out.println("Enter the array size=");
		n = sc.nextInt();

		System.out.println("Enter the array elemnts=");
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();

		for (i = 0; i < a.length; i++) {
			if (i % 2 == 1)
				opos = opos + a[i];
		}
		System.out.println("odd position value additions=" + opos);

	}

}
