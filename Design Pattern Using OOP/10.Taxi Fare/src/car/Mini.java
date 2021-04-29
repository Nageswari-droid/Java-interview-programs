package car;

public class Mini extends Car{
	public Mini() {
		this.baseCharge = 50;
		this.baseDistance = 3;
		this.nextDistance = 15;
		this.nextCharge = 10;
		this.additionalCharge = 8;
		this.maximumDistance = 75;
		this.beyondMaximumDistanceCharge = 8;
	}
}
