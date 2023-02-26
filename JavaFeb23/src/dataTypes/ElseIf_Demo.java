package dataTypes;

public class ElseIf_Demo {
	public static void main(String [] args) {
		
		/*Else if syntax
		 * 
		 * if (condition)
		 * {Code to be executed
		 * } else if (condition)
		 * {
		 * Code to be executed
		 * }
		 */
		
		int age = 55;
		
		if (age >= 18 && age <80) { 
			System.out.println("Its high time to get married");
		}else if (age > 80 && age <=129)
		{System.out.println("Pray to god you are in good health");
		}
		else
		{
			System.out.println("You are too young!! \nWait for a while"); // \n will print new line
		}
	}

}
