package oopsdemo3;

// Object class is superclass of all the classes
public class Test1 {
	public static void main(String[] args) {
		
		String s1="Hello World";
		String s2="Java";
		Object s3;
		if(s1.equals(s2)) // equals method is defined in Object class
		{
			System.out.println("Strings are Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}
}
