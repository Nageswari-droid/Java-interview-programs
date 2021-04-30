package com;

import java.util.*;
import car.*;

public class TaxiMeter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter distance in km : \n");
		int distance = scanner.nextInt();

		Car mini = new Mini();
		Car sedan = new Sedan();
		Car suv = new SUV();

		int totalMiniFare = mini.calculateTotalFare(distance);
		int totalSedanFare = sedan.calculateTotalFare(distance);
		int totalSUVFare = suv.calculateTotalFare(distance);
		System.out.println(
				"Mini - Rs. " + totalMiniFare + " , Sedan - Rs. " + totalSedanFare + " , SUV - Rs. " + totalSUVFare);
	}
}
