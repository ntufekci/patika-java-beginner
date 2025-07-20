package java101;

public class Variables {

	public static void main(String[] args) {

		// <var. type> <var. name> = <variable value>; -> address

		// Primitive - always has a value - size depends on value - all variable types
		// except String

		// Non/Primitive - can be null - String

		// NUMBERS
		// whole numbers -> byte / short / int / long
		// fractional numbers -> float / double

		// CHARACTERS - char

		// LOGICAL - boolean

		// BYTE : 8 bits - (-128 , 127) - byte
		// SHORT: 16 bits - (-32.768 , 32,767) - short
		// INT: 32 bits - int
		// LONG: 64 bits - long

		// FLOAT: 32 bits - f or F - float
		// DOUBLE: 64 bits - high level maths

		// CHAR: 16 bits - 'c' - Unicode - ASCII(numbers)

		// BOOLEAN: 1 bit - true/false - boolean

		// STRING - java.lang - class

		int numberOne = 5;
		int a, b, c = 3;
		a = 10;
		b = 15;
		c = 20;

		System.out.println(numberOne);
		System.out.println(a + ":number a " + b + ":number b " + "number c:" + c); // Concatenation

		byte max = 127;
		byte min = -128;

		System.out.println("byte's boundaries are from " + min + " to " + max + ".");

		//float decimal = 7;
		float pi = 3.14f;

		System.out.println("float type variable needs an F or f next to number " + pi + "f;");

		//char upperC = 'C';
		char at = 64;

		System.out.println("ASCII values represents characters -> " + at + " at symbol: 64");

		boolean isTrue = true;

		System.out.println(isTrue);

		String variable = "String is a class that represents char values.";
		System.out.println(variable);
		
		int x = -12, y = -5;
		System.out.print(x%y);

		// ASSIGN OPERATOR =
		// SHORTHAND +=
		// ARITHMETIC - + / * %
		// COMPARISON == != > < >= <=
		// LOGIC && AND || OR
		// TENARY 10>5 ? TRUE : FALSE;

	}

}
