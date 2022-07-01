package basics;
/* 
 * Java program to demonstrate Scanner Class to take input 
 * from User at Run Time
 */

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		// Declaration of Variables
		Scanner s=new Scanner(System.in);
		String name;
		int a,b,sum,sub,mul;
		float div;
		
		//take input from user
		System.out.println("Enter Your Name: ");
		name=s.next();
		System.out.println("Enter 2 Numbers : ");
		a=s.nextInt();
		b=s.nextInt();
		
		//process
		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=(float)a/b;  //type casting - converting one data type to another
		
		//display output
		System.out.println("The Addition is       : "+sum);
		System.out.println("The Subtraction is    : "+sub);
		System.out.println("The Multiplication is : "+mul);
		System.out.println("The Division is       : "+div);
		System.out.println("Program Created by    : "+name+" . Thank You");
		
		s.close();
	}

}
