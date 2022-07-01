package basics;
// Java Program to pass command Line Arguments
public class CommandLineDemo {

	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("Zero Args");
		}
		String name=args[0];
		int a=Integer.parseInt(args[1]);
		int b=Integer.parseInt(args[2]);
		
		int sum=a+b;
		
		System.out.println("Hello "+name);
		System.out.println("The Sum is :"+sum);
	}

}
