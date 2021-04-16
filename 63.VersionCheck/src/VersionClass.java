import java.util.Scanner;

public class VersionClass {
	public static void main(String args[]) {

		Scanner obj = new Scanner(System.in);

		String currentVersion = obj.next();
		String uploadVersion = obj.next();

		if (currentVersion.length() < uploadVersion.length()) {
			currentVersion += ".0";
		} else if (currentVersion.length() > uploadVersion.length()) {
			uploadVersion += ".0";
		}

		String[] currentArr = currentVersion.split("\\.");
		String[] uploadArr = uploadVersion.split("\\.");

		int i = 0;

		while (i < currentArr.length) {

			if (Integer.parseInt(currentArr[i]) == Integer.parseInt(uploadArr[i])) {
				if (i == currentArr.length - 1) {
					System.out.println("Rejected");
				}
				i++;
			} else if (Integer.parseInt(currentArr[i]) < Integer.parseInt(uploadArr[i])) {
				System.out.println("Allowed");
				break;
			} else {
				System.out.println("Rejected");
				break;
			}

		}

	}
}
