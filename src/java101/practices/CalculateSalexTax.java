package java101.practices;

import java.util.Scanner;

public class CalculateSalexTax {

	public static void main(String[] args) {

		double taxPercent, taxedPrice, price, taxAmount;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the price: ");
		price = input.nextFloat();
		taxPercent = price <= 1000 ? 0.18 : 0.08;

		taxedPrice = price * (1 + taxPercent);
		taxAmount = taxedPrice - price;

		System.out.println("\nTax Amount: " + taxAmount);
		System.out.println("TaxedPrice: " + taxedPrice);

		input.close();

	}

}
