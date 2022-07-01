package miscellaneous;

import com.wipro.training.microsoft.OperatingSytem;
import com.wipro.training.oracle.Database;

// Demonstrate the use of Packages
public class SoftwareList {

	public static void main(String[] args) {
		
		Database d1=new Database();
		d1.printSoftware();
		
		System.out.println("-------------------------");
		
		OperatingSytem op1=new OperatingSytem();
		op1.listSoftware();
	}

}
