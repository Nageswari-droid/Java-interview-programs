package car;

public class SUV extends Car {
    public SUV() {
        this.baseCharge = 100;
        this.baseDistance = 5;
        this.nextDistance = 15;
        this.nextCharge = 15;
        this.additionalCharge = 12;
        this.maximumDistance = 0;
        this.beyondMaximumDistanceCharge = 0;
    }
}
