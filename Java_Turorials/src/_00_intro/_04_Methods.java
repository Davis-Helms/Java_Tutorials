package _00_intro;

public class _04_Methods {
	
	/*
	 * Methods allow you to store code in one place then use it without rewriting the code.
	 * You can have as many methods as you want and call them as many times as you want
	 * They can have inputs and outputs so they can change based on what input you feed into it.
	 */
	
	
	public static int doubleIt(int number) { 
		
		// this method takes one input (an int named number) and returns it doubled
		
		System.out.println("Doubling " + number + " ...");
		
		return number * 2;
		
	}
	
	public static void printInfo() {
		
		System.out.println("This method has no input and no return.");
		System.out.println("It just stores some code.");
		System.out.println("If you want to return a value, change the 'void' in it to the type you are returning.");
		
	}
	
	public static void main(String[] args) { // the "main" method is where the compiler runs the code from
		
		int x = 2;
		System.out.println("x: " + x);
		
		int y = doubleIt(x);
		System.out.println("y: " + y);
		
		int z = doubleIt(y);
		System.out.println("z: " + z);
		
		
		// not all methods have to have math involved
		printInfo();
		
	}

}
