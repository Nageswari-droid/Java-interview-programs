package com;

public class MergeSort {
	public void merge(int[] arr, int first, int mid, int last) {
		int l = mid - first + 1;
		int r = last - mid;

		int i = 0;
		int j = 0;
		int k = first;

		int[] leftArr = new int[l];
		int[] rightArr = new int[r];

		for (i = 0; i < leftArr.length; i++) {
			leftArr[i] = arr[first + i];
		}
		for (j = 0; j < rightArr.length; j++) {
			rightArr[j] = arr[mid + j + 1];
		}

		i = 0;
		j = 0;

		while (i < l && j < r) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while (i < l) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while (j < r) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}

	}

	public void sort(int arr[], int first, int last) {
		if (first < last) {
			int mid = (first + last) / 2;
			sort(arr, first, mid);
			sort(arr, mid + 1, last);
			merge(arr, first, mid, last);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 16, 8, 12, 15, 6, 3, 9, 5 };
		int first = 0;
		int last = arr.length - 1;
		MergeSort obj = new MergeSort();
		obj.sort(arr, first, last);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
