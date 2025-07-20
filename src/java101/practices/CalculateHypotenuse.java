package java101.practices;

import java.util.Scanner;

public class CalculateHypotenuse {

	public static void main(String[] args) {

		int a, b;
		double hypotenuse;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first leg of the right-triangle length:");
		a = input.nextInt();
		System.out.println("Please enter the second leg of the righ-triangle length: ");
		b = input.nextInt();

		hypotenuse = Math.sqrt((a * a) + (b * b));

		System.out.println("Hypotenuse is " + hypotenuse);

		input.close();

	}

}
