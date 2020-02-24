package _01_classes;

public class _13_Square {
	
	/*
	 * Each of these files has one method that calls two other methods to print out each shape.
	 * Having the two methods that split the shape allow us to combine shapes and make "fancy shapes"
	 */
	
	public int volume = 24;
	
	public static void square() {
		square_top();
		square_bottom();
	}
	
	public static void square_top() {
		System.out.println(" |------|");
		System.out.println(" |      |");
		System.out.println(" |      |");
	}
	
	public static void square_bottom() {
		System.out.println(" |      |");
		System.out.println(" |      |");
		System.out.println(" |------|");
		System.out.println();
	}
}
