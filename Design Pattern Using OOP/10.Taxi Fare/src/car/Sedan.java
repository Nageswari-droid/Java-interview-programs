package car;

public class Sedan extends Car {

	public Sedan() {
		this.baseCharge = 80;
		this.baseDistance = 5;
		this.nextDistance = 15;
		this.nextCharge = 12;
		this.additionalCharge = 10;
		this.maximumDistance = 100;
		this.beyondMaximumDistanceCharge = 10;
	}
}
