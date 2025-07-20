package java101.practices;

import java.util.Scanner;

public class CalculateGroceries {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double apple = 2.14, tomatoes = 3.67, bananas = 1.11, eggplant = 0.95, pear = 5, total = 0;

		System.out.println("Please enter the weight for apples: ");
		apple *= input.nextDouble();

		System.out.println("Please enter the weight for tomatoes: ");
		tomatoes *= input.nextDouble();

		System.out.println("Please enter the weight for bananas: ");
		bananas *= input.nextDouble();

		System.out.println("Please enter the weight for eggplants: ");
		eggplant *= input.nextDouble();

		System.out.println("Please enter the weight for pears: ");
		pear *= input.nextDouble();

		total = apple + tomatoes + bananas + eggplant + pear;

		System.out.println("Your total is " + total);

		input.close();

	}

}
