package com;

import java.util.*;
import java.io.*;

public class Booking {

	static OutputClass output = new OutputClass();

	public static void ticketBooking() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		output.printUserDetails();

		long min = 1000;
		long max = 10000;
		Random random = new Random();

		String status = "";
		long PNR = min + ((long) (random.nextDouble() * (max - min)));
		String name = br.readLine();
		int age = new Scanner(System.in).nextInt();
		int coach = new Scanner(System.in).nextInt();
		char fromStation = new Scanner(System.in).next().charAt(0);
		char toStation = new Scanner(System.in).next().charAt(0);

		String coachName = setCoachName(coach);

		status = checkCoach(coachName);
		checkTicketAvailability(name, age, coachName, fromStation, toStation, PNR, status);

		br.close();
	}

	public static String setCoachName(int coach) throws IOException {
		if (coach == 1) {
			return "AC Coach";
		} else if (coach == 2) {
			return "Non-AC Coach";
		} else if (coach == 3) {
			return "Seater Coach";
		} else {
			output.printInvalidChoice("coach");
			Scanner obj = new Scanner(System.in);
			char choice = obj.next().charAt(0);

			if (Character.toLowerCase(choice) == 'y') {
				output.wrongChoice("coach");
				coach = new Scanner(System.in).nextInt();
				setCoachName(coach);
			} else if (Character.toLowerCase(choice) == 'n') {
				output.printUserChoices();
			}

			return " ";
		}
	}

	public static String checkCoach(String coach) throws IOException {
		String status = " ";
		if (coach == "AC Coach") {
			return status = AcCoach.ticketCount();
		} else if (coach == "Non-AC Coach") {
			return status = NonAcCoach.ticketCount();
		} else if (coach == "Seater Coach") {
			return status = SeaterCoach.ticketCount();
		} else {
			return " ";
		}
	}

	public static void checkTicketAvailability(String name, int age, String coachName, char fromStation, char toStation,
			long PNR, String status) throws IOException {
		InputClass inp = new InputClass();
		if (!status.equals(" ") && !status.equals("No")) {
			PassengerDB db = new PassengerDB(name, age, coachName, fromStation, toStation, PNR, status);
			if (status.equals("Ticket Confirmed")) {
				PassengerList.addList(db, status);
				PassengerDetails.printPassengerDetails(status);
			} else {
				PassengerList.addList(db, status);
				PassengerDetails.printPassengerDetails(status);
			}
		} else {
			if (status.equals(" ")) {
				System.out.println("Do you want to change the coach preference?(Y/N)");
				char choice = new Scanner(System.in).next().charAt(0);

				if (choice == 'Y' || choice == 'y') {
					System.out.println("Enter coach preference\n1.Ac\n2.Non-AC\n3.Seater");
					int coach = new Scanner(System.in).nextInt();

					coachName = setCoachName(coach);
					status = checkCoach(coachName);

					checkTicketAvailability(name, age, coachName, fromStation, toStation, PNR, status);
				}
				else {
					output.printUserChoices();
					inp.choiceMethod();
				}
			} else if (status.equals("No")) {
				System.out.println("Thank you visit again!");
				output.printUserChoices();
				inp.choiceMethod();
			}
		}
	}
}
