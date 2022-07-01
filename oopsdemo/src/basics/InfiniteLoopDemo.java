package basics;

import java.util.Scanner;

public class InfiniteLoopDemo {

	public static void main(String[] args) {
		
		System.out.println("Infinite  Loop");
		
		/*while(true)
		{
			System.out.println("Hello World");
		}*/
		Double number;
		 Scanner input = new Scanner(System.in);
		for(;;)
		{
			System.out.println("Infinite For Loop");
			 System.out.print("Enter a number: ");

	            // takes double input from user
	            number = input.nextDouble();
	         
	            // if number is negative the loop terminates
	            if (number < 0.0) {
	              break;
	            }
	            
	            System.out.println(number);
		}
	}

}
