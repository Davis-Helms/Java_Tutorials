package basics;

public class _003_Arrays {
	
	public static void main(String[] args) {
		
		// Arrays are like a list of variables
		
		int intArray[];
		
		// but they have to be set to a starting value or told how many values there is
		
		String stringArray[] = new String[5];			// String array with 5 empty spaces
		double doubleArray[] = {0.5, 6.2, 7.0, 8.1};	// Double array with 4 preset spaces
		
		// To set the values in an array use vvvvv
		// note: first index is '0'
		
		stringArray[0] = "This is the first one.";
		stringArray[1] = "This is the second one.";
		
		
		System.out.println("stringArray[0] = " + stringArray[0]);
		System.out.println("stringArray[1] = " + stringArray[1]);
		System.out.println("stringArray[2] = " + stringArray[2]); // the default value is null
		
		System.out.println();
		
		
		
		// All arrays have a length
		
		System.out.println("doubleArray's length: " + doubleArray.length);
		
	}
	
}
