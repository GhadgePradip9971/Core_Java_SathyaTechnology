package methodcalling;

import java.util.Scanner;

public class Areaoftri {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a, b, c, result;
		System.out.println("Enter the value of a, b, and c:");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();

		float area = calculateArea(a, b, c);
		System.out.println("Area of the triangle is: " + area);
	}

	static float calculateArea(float a, float b, float c) {
		float side, area;
		side = (a + b + c) / 2;
		area = (float) Math.sqrt(side * (side - a) * (side - b) * (side - c));
		return area;
	}
}
