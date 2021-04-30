package com;

import java.io.IOException;
import java.util.*;

public class PassengerDetails {
	
	static List<PassengerDB> confirmList = PassengerList.confirmList;
	static List<PassengerDB> waitingList = PassengerList.waitingList;
	
	public static void printPassengerDetails(String status) throws IOException{
		PassengerDB objVar;
		if (status.equals("Ticket Confirmed")) {
			objVar = confirmList.get((confirmList.size() - 1));
		} else {
			objVar = waitingList.get((waitingList.size() - 1));
		}
		
		outputPassengerDetails(objVar);
	}
	
	public static void outputPassengerDetails(PassengerDB objVar) throws IOException{
		System.out.println("");
		System.out.println("PNR: " + objVar.getPNR());
		System.out.println("Name: " + objVar.getName());
		System.out.println("Age: " + objVar.getAge());
		System.out.println("From station: " + objVar.getFromStation());
		System.out.println("To station: " + objVar.getToStation());
		System.out.println("Coach: " + objVar.getCoach());
		System.out.println("Ticket status: " + objVar.getStatus());
		System.out.println("Ticket booked successfully!");
		System.out.println(" ");
	
		System.out.println("Do you want to book another ticket?(Y/N)");
		char choice = new Scanner(System.in).next().charAt(0);
		
		if(choice == 'Y' || choice == 'y') {
			Booking.ticketBooking();
		}
		else {
			OutputClass obj = new OutputClass();
			InputClass inp = new InputClass();
			obj.printUserChoices();
			inp.choiceMethod();
		}
	}
}
