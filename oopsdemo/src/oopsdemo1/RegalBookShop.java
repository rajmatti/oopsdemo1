package oopsdemo1;

//reuse the class BookStore -- Create a instance of BookStore class
public class RegalBookShop {

	public static void main(String[] args) {
		
		BookStore bs1=new BookStore(); // Create instance of BookStore
		
		BookStore hello=new BookStore();
		
		bs1.inputBookDetails();  // call BookStore class methods
		bs1.displayBookDetails();
		
		hello.inputBookDetails();
		hello.displayBookDetails();

	}

}
