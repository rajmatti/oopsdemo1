package oopsdemo3;

public class College {
	
	String name;
	int id;
	String universty;
	String course;
	
	//generate constructor using fields
	public College(String name, int id, String universty, String course) {
		this.name = name;
		this.id = id;
		this.universty = universty;
		this.course = course;
	}

	// generate getters
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getUniversty() {
		return universty;
	}

	public String getCourse() {
		return course;
	}
	
	

}
