package java101.practices;

import java.util.Scanner;

public class CalculateBMI {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double kg, cm, bmi;

		System.out.println("Please enter your height: ");
		cm = input.nextDouble();
		System.out.println("Please enter your weight: ");
		kg = input.nextDouble();

		bmi = kg / ((cm * cm) / 10000);

		System.out.println("Your Body Mass Index is : " + bmi);

		input.close();

	}

}
