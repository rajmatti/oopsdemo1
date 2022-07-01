package miscellaneous;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String s1="James Gosling";
		String s2="James gosling";
		
		String s3=new String("Hello World");
		
		if(s1==s2) // == operator Checks wether Strings points to same reference
		{
			System.out.println("Strings Are Equal");
		}
		else
		{
			System.out.println("Strings are Not Equal");
		}
		System.out.println("The Length of String \'"+s3+"\' is :"+s3.length());
		String s4=s3.concat(s2);
		System.out.println(s4);
		
		System.out.println(s4.replace('o','p'));
	}

}
