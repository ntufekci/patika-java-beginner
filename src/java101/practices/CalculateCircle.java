package java101.practices;

import java.util.Scanner;

public class CalculateCircle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double pi = 3.14;
		double r, area, perimeter, angleArea, alpha;

		System.out.println("Please enter the radius of circle: ");
		r = input.nextDouble();

		area = pi * (r * r);
		perimeter = 2 * pi * r;

		System.out.println("The area is " + area);
		System.out.println("The perimeter is " + perimeter);

		System.out.println("Please enter the central angle 𝛼: ");
		alpha = input.nextDouble();
		angleArea = (pi * (r * r) * alpha) / 360;
		System.out.println(
				"The area of sector of a circle with the perimeter " + r + " and angle " + alpha + " is " + angleArea);
		input.close();

	}

}
