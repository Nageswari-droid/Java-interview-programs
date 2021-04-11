package com;

public class QuickSortNew {

	public void swap(int[] arr, int one, int two) {
		int temp;

		temp = arr[one];
		arr[one] = arr[two];
		arr[two] = temp;
	}

	public int partition(int[] arr, int pivot, int first, int last) {
		int i = first;
		int j = last;

		while (i <= j) {
			while (arr[i] <= pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i < j) {
				swap(arr, i, j);
			}
		}

		swap(arr, first, j);
		return j;
	}

	public void quickSort(int[] arr, int first, int last) {
		if (first < last) {
			int pivot = arr[first];
			int index = partition(arr, pivot, first, last);
			quickSort(arr, first, index - 1);
			quickSort(arr, index + 1, last);
		}
	}

	public static void main(String args[]) {
		int arr[] = { 10, 16, 8, 12, 15, 6, 3, 9, 5 };
		int first = 0;
		int last = arr.length - 1;
		QuickSortNew q = new QuickSortNew();
		q.quickSort(arr, first, last);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
