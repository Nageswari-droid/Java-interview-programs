
public class ArrayRotation {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int temp;
		int j = 0;
		int d = 2;

		while (d != 0) {
			temp = arr[0];
			j = 0;
			for (int i = 1; i < arr.length; i++) {
				arr[j] = arr[i];
				j++;
			}
			arr[j] = temp;
			d--;

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
