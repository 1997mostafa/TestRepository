package dataTypes;

public class ComparisonOperator {
	
	public static void main (String [] args) {
		String actual = "Google";
		String expected = "google";
		/* ==
		 * != not equal to 
		 * >
		 * <
		 * >=
		 */
		
		System.out.println( actual == expected);// flase
		System.out.println(actual != expected); // true
		
		int a = 15;
		int b = 16;
		
		System.out.println(a > b);// false
		System.out.println(a < b);// true
	}

}
