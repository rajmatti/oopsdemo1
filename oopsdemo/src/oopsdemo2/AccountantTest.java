package oopsdemo2;
/*
 * Program to implement Single Inheritance
 */

public class AccountantTest {

	public static void main(String[] args) {
		
		Accountant ac1=new Accountant(201,"Gaurav Sharma","Process Salary of Employees","SAP");
		Accountant ac2=new Accountant(205,"Mary John","Payment to Vendors","Tally");
		
		ac1.display();//base class method
		ac1.print(); // derived class method
		
		ac2.display();
		ac2.print();

	}

}
