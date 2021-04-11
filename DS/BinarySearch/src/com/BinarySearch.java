package com;

public class BinarySearch {
	public void binarySearch(int arr[], int first, int last, int key) {
		int midpoint = (first + last) / 2;
		if (key == arr[midpoint]) {
			System.out.println("Key found at the index " + midpoint);
		} else if (key < arr[midpoint]) {
			binarySearch(arr, first, midpoint, key);
		} else {
			binarySearch(arr, midpoint + 1, last, key);
		}
	}

	public static void main(String args[]) {
		int arr[] = { 3, 5, 6, 8, 9, 10, 12, 15, 16 };
		int first = 0;
		int last = arr.length - 1;
		int key = 10;
		BinarySearch obj = new BinarySearch();
		obj.binarySearch(arr, first, last, key);
	}
}
