package basics;

import java.util.Scanner;

/*
 * Java Program to find sum & average of 3 Numbers
 */
public class SumAverage {

	public static void main(String[] args) {
		
		// Variable Declarations
		// Scanner class next() methods are used to take input from user at Runtime
		Scanner s=new Scanner(System.in);
		int num1,num2,num3,sum;
		float avg;
		
		//Input Statements
		System.out.println("Enter ur Name:");
		String name=s.next(); // String Input
		System.out.println("Enter ur Marks :");
		float marks=s.nextFloat();  // Float input
		System.out.println("Enter 3 Numbers : ");
		num1=s.nextInt();    // Integer Input
		num2=s.nextInt();
		num3=s.nextInt();
		
		//processing statements
		sum=num1+num2+num3;
		avg=(float)sum/3;// Type casting-> Converting type of a variable to another type
		
		//Output Statements
		System.out.println("***********************************");
		System.out.println("The Sum of 3 Numbers is     : "+sum);
		System.out.println("The Average of 3 Numbers is :"+avg);
		System.out.print("The Average of 3 Numbers is :");
		System.out.format("%.2f", avg);
		System.out.println();
		System.out.println();
		
		System.out.print("The Average of 3 Numbers is :");
		System.out.format("%.1f", avg);
		
		System.out.println();
		System.out.println("***********************************");
		
		System.out.println(" Hello "+name+" .You Have Scored "+marks+ " Marks");
		
		s.close();
	}

}
