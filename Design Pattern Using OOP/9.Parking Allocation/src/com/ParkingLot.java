package com;

import java.util.*;

import printer.Output;

public class ParkingLot {

	private static List<Integer> allocatedParkingLot;
	private static List<Car> carDetailsList;
	private int parkingLimit;

	public ParkingLot(int parkingLimit) {
		this.allocatedParkingLot = new ArrayList<>();
		this.carDetailsList = new ArrayList<>();
		this.parkingLimit = parkingLimit;
	}

	public void park() {
		Scanner scanner = new Scanner(System.in);
		Output.displayConsoleNewLine("Enter the parking lot number : \n");
		int parkingNumber = scanner.nextInt();
		int flag = 1;

		long min = 1000;
		long max = 10000;
		Random random = new Random();

		long carId = min + ((long) (random.nextDouble() * (max - min)));

		if (parkingNumber <= 0 && parkingNumber > 6) {
			Output.displayConsoleNewLine("Parking lot number limit lies between 1 - 6. Try again \n");
			return;
		}

		if (allocatedParkingLot.size() == 0) {
			allocatedParkingLot.add(parkingNumber);
			Car car = new Car(carId, parkingNumber);
			carDetailsList.add(car);
			Output.displayConsoleNewLine(
					"Parking lot is allocated. Parking lot number is " + parkingNumber + ". Car id is " + carId);
			return;
		}

		if (!allocatedParkingLot.contains(parkingNumber)) {
			allocatedParkingLot.add(parkingNumber);
			Car car = new Car(carId, parkingNumber);
			carDetailsList.add(car);
			flag = 0;
		}

		if (flag != 0) {
			Output.displayConsoleNewLine("Parking lot number is already taken. Try some other lot.\n");
			return;
		}

		Output.displayConsoleNewLine(
				"Parking lot is allocated. Parking lot number is " + parkingNumber + ". Car id is " + carId);
	}

	public void unpark() {
		Scanner scanner = new Scanner(System.in);
		if (allocatedParkingLot.size() == 0) {
			Output.displayConsoleNewLine("No car in parking lot.\n");
			return;
		}
		Output.displayConsoleNewLine("Enter car id : \n");
		int carId = scanner.nextInt();
		Output.displayConsoleNewLine("Enter the parking lot number : \n");
		int parkingNumber = scanner.nextInt();

		boolean validateCar = false;
		int flag = 0;

		for (int i = 0; i < carDetailsList.size(); i++) {
			long carIDFromList = carDetailsList.get(i).getCarId();
			if (carIDFromList == carId) {
				if (carDetailsList.get(i).getParkingLotNumber() == parkingNumber) {
					validateCar = true;
				}
			}
		}

		if (!validateCar) {
			Output.displayConsoleNewLine("Check your car id or parking lot number again.\n");
			return;
		}

		for (int i = 0; i < allocatedParkingLot.size(); i++) {
			if (allocatedParkingLot.get(i) == parkingNumber) {
				allocatedParkingLot.remove(i);
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			Output.displayConsoleNewLine("No car in parking lot number " + parkingNumber + "\n");
			return;
		}

		Output.displayConsoleNewLine("Car unparked from " + parkingNumber + " parking lot\n");
	}

}
