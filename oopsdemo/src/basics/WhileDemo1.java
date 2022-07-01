package basics;
/* 
 * Program to display ur name 10 times & numbers from 1 to 10.
 * 
 * Understand the concept of Loop.
 * Loop - A set of statements executing repeatedly , until a particular 
 * condition is TRUE.
 */
public class WhileDemo1 {

	public static void main(String[] args) {
		
		int i=1;  		// loop initialization
		
		while(i<=10)  	// set a condition -TRUE
		{
			System.out.println(i+ " Raj");
			
			i=i+1;		// Increment Loop i++; i+=1;
		}
		
		System.out.println("Exiting the Loop.........");
		
	System.out.println("******** Reverse Loop **************");
	System.out.println("********Display numbers from 10 -1 **************");	
		int j=101;
		
		while(j>=1)
		{
			System.out.println(j);
			
			j=j-1;  //Decrement Loop
		}
	}

}
