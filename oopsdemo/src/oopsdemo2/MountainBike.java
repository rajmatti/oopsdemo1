package oopsdemo2;

public class MountainBike extends Bicycle {

	public int seatHeight;
	
	public MountainBike(int gear, int speed,int s) {
		super(gear, speed);
		this.seatHeight=s;
		
	}
	
	// generate setter for seatHeight
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	
	
}
