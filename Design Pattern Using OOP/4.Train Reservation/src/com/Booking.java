package com;

import java.util.*;
import java.io.*;

public class Booking {
	public static void ticketBooking() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		OutputClass output = new OutputClass();

		output.printUserDetails();

		long min = 1000;
		long max = 10000;
		Random random = new Random();

		String status = "";
		long PNR = min + ((long) (random.nextDouble() * (max - min)));
		String name = br.readLine();
		int coach = new Scanner(System.in).nextInt();
		int age = new Scanner(System.in).nextInt();
		char fromStation = new Scanner(System.in).next().charAt(0);
		char toStation = new Scanner(System.in).next().charAt(0);

		if (coach == 1) {

		} else if (coach == 2) {

		} else if (coach == 3) {
		} else {
			output.printInvalidChoice("coach");
		}

		PassengerDB db = new PassengerDB(name, age, coach, fromStation, toStation, PNR, status);
		PassengerList.addList(db);

		br.close();
	}
}
