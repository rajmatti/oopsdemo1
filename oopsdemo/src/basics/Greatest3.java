package basics;

import java.util.Scanner;

// program to find greatest of 3 numbers using if -else if -else
public class Greatest3 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter 3 numbers:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		s.close();
		
		 // logical operators are used to combine multiple conditions
		// && - All Conditions should be TRUE
		if(a>b && a>c)
		{
			System.out.println(a+" is Greatest");
		}
		else if(a==b && b==c)
		{
			System.out.println("All Numbers are Equal");
		}
		else if(a==b)
		{
			System.out.println("A & B are Equal");
		}
		else if( b==c )
		{
			System.out.println("B & C are Equal");
		}
		else if( a==c )
		{
			System.out.println("A & C are Equal");
		}
		else if(b>c)
		{
			System.out.println(b+" is Greatest");
		}
		
		
		else
		{
			System.out.println(c+ " is Greatest");
		}

	}

}
