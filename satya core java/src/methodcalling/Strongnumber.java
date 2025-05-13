package methodcalling;

import java.util.Scanner;

public class Strongnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		int result = strong_number(n); // calling method
		if (n == result) {
			System.out.println("Strong number");
		} else {
			System.out.println("Not a strong number");
		}
	}

	static int strong_number(int n) {
		int rem, sum = 0, fact, temp = n;
		while (temp > 0) {
			rem = temp % 10;
			fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact *= i;
			}
			sum += fact;
			temp /= 10;
		}
		return sum;
	}
}
