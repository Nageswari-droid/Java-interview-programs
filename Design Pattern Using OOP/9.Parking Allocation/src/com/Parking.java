package com;

import java.util.*;
import printer.Output;

public class Parking {

	private static int parkingLimit = 6;

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		int i = 1;

		Output.displayConsoleNewLine("Parking lot limit is " + parkingLimit);

		Output.displayConsoleNewLine("\n");
		
		ParkingLot parkingLot = new ParkingLot(parkingLimit);

		while (i <= 20) {
			Output.displayConsoleNewLine("\n");
			Output.displayConsoleNewLine("1.Park\n2.Unpark\n");
			int choice = scanner.nextInt();

			if (choice == 1) {
				parkingLot.park();
			} else if (choice == 2) {
				parkingLot.unpark();
			}
			Output.displayConsoleNewLine("\n");
			i++;
		}

	}
}
