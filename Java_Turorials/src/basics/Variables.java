package basics;

public class Variables {

	public static void main(String[] args) {
		
		// Smallest to largest
		byte testByte; 					//(number, 1 byte)
		short testShort; 				//(number, 2 bytes)
		int testInt; 					//(number, 4 bytes)
		long testLong;					//(number, 8 bytes)
		float testFloat;				//(float number, 4 bytes)
		double testDouble;				//(float number, 8 bytes)
		char testChar;					//(a character, 2 bytes)
		String testString;				//(characters, more bytes)
		boolean testBoolean;			//(true or false, 1 byte)
		
		// If you want to use it you either have to initialize it to a value
		int testInt2 = 5;
		// Or assign it to a value
		testInt = 2;
		// Or assign it to another variable
		int testInt3 = testInt;
		
		System.out.println(testInt);
		
		
		// math can be done with number variables
		testInt = testInt2 * testInt;
		
		
		// String and char
		// char is one letter/number String is many
		testChar = 'y'; // char must use ' ' (single quotes)
		testString = "yes"; // String use " " (double quotes)
		
		System.out.println(testString);
		
		
		String testString2 = "See?";
		System.out.println("You can combine with the '+' operator " + testString2);
		
		System.out.println("Works with numbers too " + testInt3 + testInt2);
		System.out.println("Works with numbers too " + testInt3 + ", " + testInt2); //this one is better because spacing
		
		System.out.println("If you want to add, put in ( ) : " + (testInt3 + testInt2));
		
		
	}

}
