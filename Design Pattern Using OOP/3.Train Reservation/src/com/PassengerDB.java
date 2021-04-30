package com;

public class PassengerDB {

	String name = "";
	String coach;
	int age;
	char fromStation = ' ';
	char toStation = ' ';
	long PNR;
	String status = "";

	public PassengerDB(String name, int age, String coach, char fromStation, char toStation, long PNR, String status) {
		this.name = name;
		this.coach = coach;
		this.age = age;
		this.fromStation = fromStation;
		this.toStation = toStation;
		this.PNR = PNR;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCoach() {
		return coach;
	}

	public char getFromStation() {
		return fromStation;
	}

	public char getToStation() {
		return toStation;
	}
	
	public String getStatus() {
		return status;
	}
	
	public long getPNR() {
		return PNR;
	}
}
