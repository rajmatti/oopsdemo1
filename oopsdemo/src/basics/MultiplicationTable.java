package basics;

import java.util.Scanner;

// Java program to display Multiplication Table of a Number

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		sc.close();
		int i=1;
		
		System.out.println("The Multiplication Table of "+n+" is : ");
		
		do {
			System.out.println(n+" * "+i+" = "+(n*i));
			i++;
		}while(i<=10);

	}

}
