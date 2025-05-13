package Patterns;

public class simple1 {
	public static void main(String args[]) {
		// outerloop for printing rows
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
