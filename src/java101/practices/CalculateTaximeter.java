package java101.practices;

import java.util.Scanner;

public class CalculateTaximeter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double perKm = 2.20;
		double fee = 10;
		double kmFee;
		double km;

		System.out.println("How many km's have been traveled ?");
		km = input.nextDouble();

		kmFee = km * perKm;

		fee += kmFee;
		fee = fee < 20 ? 20 : fee;

		String bill = "Your bill is " + fee + "$.";
		System.out.println(bill);
		input.close();

	}

}
