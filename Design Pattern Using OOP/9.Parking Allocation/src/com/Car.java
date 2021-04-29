package com;

public class Car {
	private long carId;
	private int parkingLotNumber;

	public Car(long carId, int parkingLotNumber) {
		this.carId = carId;
		this.parkingLotNumber = parkingLotNumber;
	}

	public long getCarId() {
		return carId;
	}

	public int getParkingLotNumber() {
		return parkingLotNumber;
	}
}
