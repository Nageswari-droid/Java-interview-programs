
public class InsertionSort {
	public static void main(String args[]) {
		int arr[] = { 10, 16, 8, 12, 15, 6, 3, 9, 5 };

		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0 && temp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}

			arr[j] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
