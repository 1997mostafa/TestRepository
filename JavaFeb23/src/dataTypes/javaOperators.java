package dataTypes;

public class javaOperators {
	public static void main(String [] args) {
		/* There are 5 types of java 
		 * 
		 * Arithmetic operator
		 * Assignment operator 
		 * Comparison/relational operator
		 * Logical operators
		 * Bitwise operators
		 * 
		 */
		
		//Learning arithmetic operators
		// they are +, -, *,  /, %, ++, --
		
		int a = 10;
		int b = 5; 
		int result;
		
		result = a + b; // addition
		System.out.println( "addition result is " + result);
		
		result = a - b; //subtraction
		System.out.println("Subtraction result is " + result);
		
		result = a * b;//multiplication
		System.out.println("Multiplication result is " + result );
		
		result = a / b;
		System.out.println("Division result is " + result);
		
		result = a % b;
		System.out.println("Modulus result is " + result);
		
		System.out.println("Incremental a is " + a++);
		
		System.out.println("Decremental a is " + a--);
		
	}

}
