package _01_classes;

public class _15_Triange {
	
	/*
	 * Each of these files has one method that calls two other methods to print out each shape.
	 * Having the two methods that split the shape allow us to combine shapes and make "fancy shapes"
	 */
	
	public int volume = 9;
	
	public static void triangle() {
		triangle_top();
		triangle_bottom();
	}
	
	public static void triangle_top() {
		System.out.println("    O   ");
		System.out.println("   O O  ");
		System.out.println("  O   O ");
	}
	
	public static void triangle_bottom() {
		System.out.println(" O     O ");
		System.out.println("OOOOOOOOO");
		System.out.println();
	}
}
