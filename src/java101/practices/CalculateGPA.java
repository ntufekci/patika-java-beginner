package java101.practices;

import java.util.Scanner;

public class CalculateGPA {
	public static void main(String[] args) {

		int math, phy, chem, bio, history, music, total = 0;
		double gpa;
		String isPassed;

		Scanner input = new Scanner(System.in);

		System.out.println("Mathematics Grade: ");
		math = input.nextInt();
		System.out.println("Physics Grade: ");
		phy = input.nextInt();
		System.out.println("Chemistry Grade: ");
		chem = input.nextInt();
		System.out.println("Biology Grade: ");
		bio = input.nextInt();
		System.out.println("History Grade: ");
		history = input.nextInt();
		System.out.println("Music Grade: ");
		music = input.nextInt();
		total += (math + phy + chem + bio + history + music);
		gpa = total / 6;

		System.out.println("Your GPA is " + gpa);

		isPassed = gpa > 60 ? "Passed" : "Failed";

		System.out.println("Semester is " + isPassed);

		input.close();

	}

}
