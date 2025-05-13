package Arrays;

import java.util.Scanner;

public class Searchelemnt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 23, 45, 67, 91, 32, 11, 60 };
		int i, keyelement, pos = 0, found = 0;
		System.out.println("Enter the key element=");
		keyelement = sc.nextInt();

		for (i = 0; i < a.length; i++) {
			if (a[i] == keyelement) {
				found = 1;
				pos = i;
				break;
			}
		}
		if (found == 1) {
			System.out.println("Search is succesfull keyelement is found=" + pos);
		} else
			System.out.println("Search is unsuccesfull ,Keyelemnt is not found");

	}
}
