package car;

public class Car {

    protected int baseCharge;
    protected int baseDistance;
    protected int nextDistance;
    protected int nextCharge;
    protected int additionalCharge;
    protected int maximumDistance;
    protected int beyondMaximumDistanceCharge;

    public int calculateTotalFare(int distance) {
        int totalFare = 0;
        int extraCost = 0;

        if (maximumDistance != 0 && distance > maximumDistance) {
            return totalFare = distance * beyondMaximumDistanceCharge;
        }

        if (distance < baseDistance) {
            totalFare = baseCharge;
            return totalFare;
        }

        distance = distance - baseDistance;
        totalFare += baseCharge;

        if (distance <= nextDistance) {
            extraCost = distance * nextCharge;
            totalFare += extraCost;
            return totalFare;
        }

        distance = distance - nextDistance;
        extraCost = nextDistance * nextCharge;
        totalFare += extraCost;

        if (maximumDistance != 0 && distance <= maximumDistance) {

            extraCost = distance * additionalCharge;
            totalFare += extraCost;
            return totalFare;

        }

        extraCost = distance * additionalCharge;
        totalFare += extraCost;

        return totalFare;
    }
}
