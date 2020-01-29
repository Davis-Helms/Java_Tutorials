package basics;

public class _001_Comments {

	public static void main(String[] args) {
		
		// _001_Comments hide notes
		System.out.println("'//' is the notation for a comment.");
		
		// System.out.println("see?");
		
		
		/*
		This is inside a block comment, it needs a start and an end (seen above and below)
		*/
		
		System.out.println("So this gets printed");
		// System.out.println("And this doesn't");
		
		
		int test = 0;
		
		// _001_Comments can appear half way through a line, but then the rest of the line is "gone" to the program
		
		test = test + 1 + 5 // + 1000;
		; // this semicolon is here to finish the previous line
		
		System.out.println(test);
		
	}

}
