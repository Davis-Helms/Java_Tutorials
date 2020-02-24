package _01_classes;

public class _01_Objects_Intro {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		/*
		 * Objects make it so you don't have to type out the entire filename every time you want to use that file's code.
		 * You can make multiple objects of the same class.
		 * These multiple objects can have different names and different information (variables) stored there.
		 * By making an object it allows you to use the variables and have multiple objects with different values in their variables.
		 */
		
		_001_Circle circle = new _001_Circle();
		
		circle.circle();
		
		System.out.println("Volume of this circle: " + circle.volume);
		System.out.println();
		
		
		
		
		// Multiple objects of the same class allow for lots of possibilities.
		
		_002_Diamond diamond1 = new _002_Diamond();
		_002_Diamond diamond2 = new _002_Diamond();
		
		diamond1.diamond();
		
		diamond2.diamond_bottom();
		diamond2.volume = 100;
		
		System.out.println("Volume of diamond1: " + diamond1.volume);
		System.out.println("Volume of diamond2: " + diamond2.volume);
		
	}

}
