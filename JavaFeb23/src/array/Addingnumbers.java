package array;

public class Addingnumbers {

	public static void main(String[] args) {
		/*Write a program that sums the numbers from 0 to 15
		 * using for, while and do while loop.
		 */
	// Sum of 0 to 15 using for
	int sum = 0;
	for (int i = 0; i <= 15; i++)
	{
		sum = sum + i;
	}
	
	//using  while loop
	System.out.println("The result is: " + sum);
	
	int sum2 =0; 
	int i = 0; 
	while (i <= 15)
			 {
				sum2 = sum2 + i;
				i ++;
			 }
	System.out.println("The result is: " + sum2);	 

	}

}
