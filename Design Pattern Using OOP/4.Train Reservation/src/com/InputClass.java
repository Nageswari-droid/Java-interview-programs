package com;

import java.util.*;
import java.io.*;

public class InputClass {
	public void choiceMethod() throws IOException {
		Scanner obj = new Scanner(System.in);
		int choice = obj.nextInt();

		switch (choice) {
		case 1: {
			Booking.ticketBooking();
			break;
		}
		case 2: {
			break;
		}
		case 3: {
			break;
		}
		default: {
			System.out.print("Invalid choice!");
			System.out.println("Choose again!");
			System.out.println();

		}
		}
	}

	public int coachPreference() throws IOException {
		Scanner obj = new Scanner(System.in);
		char choice = obj.next().charAt(0);

		if (Character.toLowerCase(choice) == 'y') {

		} else if (Character.toLowerCase(choice) == 'n') {
		}

		return 0;
	}
}
