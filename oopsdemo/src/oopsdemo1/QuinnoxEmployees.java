package oopsdemo1;

//main class 
public class QuinnoxEmployees {

	public static void main(String[] args) {
		
		Employee e1=new Employee();// create instance/obj of Employee class
		Employee e2=new Employee();
		
		e1.inputEmployeeDetails(); // invoke methods using Employee object
		e1.calculateNetSalary();
		e1.displayEmployeeDetails();
		
		e2.inputEmployeeDetails(); // invoke methods using Employee object
		e2.calculateNetSalary();
		e2.displayEmployeeDetails();

	}

}
