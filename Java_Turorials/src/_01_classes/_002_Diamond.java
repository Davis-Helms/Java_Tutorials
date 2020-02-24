package _01_classes;

public class _002_Diamond {
	
	/*
	 * Each of these files has one method that calls two other methods to print out each shape.
	 * Having the two methods that split the shape allow us to combine shapes and make "fancy shapes"
	 */
	
	public int volume = 12;
	
	public static void diamond() {
		diamond_top();
		diamond_bottom();
	}
	
	public static void diamond_top() {
		System.out.println("    /\\   ");
		System.out.println("   /  \\    ");
		System.out.println("  /    \\    ");
	}
	
	public static void diamond_bottom() {
		System.out.println("  \\    /   ");
		System.out.println("   \\  /   ");
		System.out.println("    \\/    ");
		System.out.println();
	}
}
