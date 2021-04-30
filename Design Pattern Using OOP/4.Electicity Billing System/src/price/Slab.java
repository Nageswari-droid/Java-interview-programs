package price;

public class Slab {
	private int slabOne = 20;
	private int slabTwo = 30;
	private int slabThree = 40;
	private int slabFour = 50;

	public int calculateBill(int units) {
		if (units <= 1000) {
			return units * slabOne;
		} else if (units <= 3000) {
			return (1000 * slabOne + (units - 1000) * slabTwo);
		} else if (units <= 6000) {
			return (1000 * slabOne + 2000 * slabTwo + (units - 3000) * slabThree);
		} else {
			return (1000 * slabOne + 2000 * slabTwo + 3000*slabThree +(units - 6000) * slabFour);
		}
	}
}
