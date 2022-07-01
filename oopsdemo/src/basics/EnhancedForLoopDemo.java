package basics;

public class EnhancedForLoopDemo {

	public static void main(String[] args) {
		
		String[] names= {"Jhon","Mike","Rod","Gavin"};
		
		System.out.println("Array Contents :");
		
		//enhanced For Loop to display array contents
		for(String x:names)
		{
			System.out.println(x);
		}
	}

}
