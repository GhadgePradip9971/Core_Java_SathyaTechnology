package Strings;

import java.util.Scanner;

public class Chardigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter the caharacter=");
		ch = sc.next().charAt(0);

		if (ch >= '0' && ch <= '9')
			System.out.println("digit");
		else
			System.out.println("not digit");

	}

}
