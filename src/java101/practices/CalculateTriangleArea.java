package java101.practices;

import java.util.Scanner;

public class CalculateTriangleArea {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a, b, c, perimeter, u;
		double area;

		System.out.println("Please enter first side of triangle: ");
		a = input.nextInt();

		System.out.println("Please enter second side of triangle: ");
		b = input.nextInt();

		System.out.println("Please enter third side of triangle: ");
		c = input.nextInt();

		perimeter = a + b + c;
		u = perimeter / 2;

		area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

		System.out.println(area);

		input.close();

	}

}
