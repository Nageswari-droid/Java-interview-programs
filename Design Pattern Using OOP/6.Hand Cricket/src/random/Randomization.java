package random;

public class Randomization {
	private static int[] ballScoreArray = { 0, 1, 2, 3, 4, 6 };
	
	public static int generateRandomRun() {
		int randomValue;
		randomValue = ballScoreArray[(int) Math.floor(Math.random() * ballScoreArray.length)];
		return randomValue;
	}
}
