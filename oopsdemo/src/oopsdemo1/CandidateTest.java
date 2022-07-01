package oopsdemo1;

public class CandidateTest {

	public static void main(String[] args) {
	
		//invoke parameterized constructor
		Candidate cd1=new Candidate(101,"James Gosling",5000.00f);
		
		Candidate cd2=new Candidate(102,"Navin Kumar",6000.00f);
		
		cd1.calculateDA();
		cd1.display();
		
		cd2.calculateDA();
		cd2.display();

	}

}
