package basics;

import java.util.Scanner;

/*
 * Java Program to find sum of only positive numbers 
 */
public class SumPositive {

	public static void main(String[] args) {
		
		int sum = 0;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

		   int number=1;
		   
	    // while loop continues 
	    // until entered number is positive
	    while (number >= 1) {
	      // add only positive numbers
	      sum += number;

	      System.out.println("Enter a number");
	      number = input.nextInt();
	    }
		   
	    System.out.println("Sum = " + sum);
	    input.close();
	}

}
