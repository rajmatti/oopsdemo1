package oopsdemo1;

// Program to add 2 complex numbers- Real & Imaginary part
public class Complex {
	
	double real;
	double imaginary;
	
		// Generate Constructor using fields
	public Complex(double real, double imaginary) { // parameterized constructor
		this.real = real;
		this.imaginary = imaginary;
	}

	void add(Complex obj) // method which accepts object as an argument
	{
	 //   c1.real+=c2.rail
		this.real+=obj.real;
		this.imaginary+=obj.imaginary;
	}
	
		
	void display()
	{
		System.out.println("r"+this.real+" + i"+this.imaginary);
	}

}
