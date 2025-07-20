package java101;

import java.util.Scanner;
public class InputFromUser {

	public static void main(String[] args) {
		
		int a;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		a = input.nextInt();
		
		System.out.println("Your number is : " + a);
		
		
		System.out.println("Please enter a name: ");
		String name = input.next();
		
		System.out.println("Your name is: " + name);
		
		input.close();
				
	}

}
