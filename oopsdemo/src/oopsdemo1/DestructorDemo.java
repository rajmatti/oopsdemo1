package oopsdemo1;

class Test
{
	//destructor
	public void finalize()  // override finalize() method of Object class
	{
		System.out.println("Object Destroyed & Garbage Collected");
	}
}

public class DestructorDemo {

	public static void main(String[] args) {
		
		Test t1=new Test();  // initialize Object -- invokes default constructor
		Test t2=new Test();
		Test t3=new Test();
		Test t4=new Test();
		
		t1=null;   // deallocate memory - Objects destroyed explicitly
		t2=null;
		t3=null;
		//t4=null;
		
		System.gc();// invoke service method gc() -- > invoke finalize()
		
		System.out.println("In Main Method");
		
		

	}

}
