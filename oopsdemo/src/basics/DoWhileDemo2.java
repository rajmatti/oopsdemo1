package basics;
// Java Program to display Multiplication Table

public class DoWhileDemo2 {

	public static void main(String[] args) {
		
		int row,column;
		
		System.out.println(" *********** Multiplication Table ********** \n");
		
		row=1;
		do {								//	1  2   ... 10  -10
			column=1;
			do {							//  10 10  ....10  -100
				int mul=row*column;
				System.out.print(mul+"\t");
				
				column=column+1;
			} while(column <=10);
			
			System.out.println();
			row=row+1;
		} while(row <=10);

	}

}
