package javanbatchesprg;

import java.util.Scanner;

public class Arraythird {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[20];
		int i, n;
		System.out.println("Enter array size=");
		n = sc.nextInt();

		System.out.println("Enter the array elements=");
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();

	}

}
