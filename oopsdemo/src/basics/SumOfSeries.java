package basics;

import java.util.Scanner;

/* 
 * Program to find sum of series .. 1 + 2 + 3 + ..... + n
 */
public class SumOfSeries {

	public static void main(String[] args) {
		
		int i=1,n,sum=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Value for N : ");
		n=s.nextInt();
		s.close();
		
		while(i<=n) // 1-5
		{
			sum=sum+i;  // 1+2+3+4+5= 15
			//System.out.println(sum);
			i=i+1;
		}
		System.out.println("The Sum of Series is : "+sum);
	}

}
