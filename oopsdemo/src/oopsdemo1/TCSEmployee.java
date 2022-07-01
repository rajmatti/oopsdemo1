package oopsdemo1;

public class TCSEmployee {

	public static void main(String[] args) {
		Employee emp1=new Employee();// create instance/obj of Employee class
		Employee emp2=new Employee();
		
		emp1.inputEmployeeDetails(); // invoke methods using Employee object
		emp1.calculateNetSalary();
		emp1.displayEmployeeDetails();
		
		emp2.inputEmployeeDetails(); // invoke methods using Employee object
		emp2.calculateNetSalary();
		emp2.displayEmployeeDetails();

	}

}
