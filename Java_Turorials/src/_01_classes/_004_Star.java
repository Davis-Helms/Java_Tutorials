package _01_classes;

public class _004_Star {
	
	/*
	 * Each of these files has one method that calls two other methods to print out each shape.
	 * Having the two methods that split the shape allow us to combine shapes and make "fancy shapes"
	 */
	
	public int volume = 10;
	
	public static void star() {
		star_top();
		star_bottom();
	}
	
	public static void star_top() {
		System.out.println("    /\\   ");
		System.out.println("   /  \\    ");
		System.out.println("---    ---    ");
	}
	
	public static void star_bottom() {
		System.out.println("  \\    /   ");
		System.out.println("   //\\\\    ");
		System.out.println("  /    \\   ");
		System.out.println();
	}
}
