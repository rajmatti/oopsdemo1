package exceptionsdemo;

import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input two integers :");

		int result = 0;
		int arr[] = new int[5];

		try {
			arr[0] = 0;
			arr[1] = 1;
			arr[2] = 2;
			arr[3] = 3;
			arr[4] = 4;
			//arr[5] = 5;
			
			int num1 =input.nextInt();
			int num2 = input.nextInt();
			
			result = num1 / num2;
			System.out.println("Result of Division : " + result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Err: Divide by Zero");
		}

		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Err: Array Index out of Bound");
		}
		catch(Exception a)
		{
			a.printStackTrace();
		}

	}

}
