package javanbatchesprg;

import java.util.Scanner;

public class Arrayfirst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, epos = 0, opos = 0, n;

		int a[] = new int[20];

		System.out.print("Enter array size=");
		n = sc.nextInt();

		System.out.print("Enter array elements=");
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();

		for (i = 0; i < a.length; i++) {
			if (i % 2 == 0)
				epos = epos + a[i];

			else
				opos = opos + a[i];

		}
		System.out.println("Sum of even position=" + epos);
		System.out.println("sum of odd positions=" + opos);
	}

}
