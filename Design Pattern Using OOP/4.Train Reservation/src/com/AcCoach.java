package com;

import java.io.IOException;

public class AcCoach extends Coach {

	static int confirmTicket = 2;
	static int waitingList = 2;

	public static String ticketCount() throws IOException {
		if (confirmTicket != 0 || waitingList != 0) {
			if (confirmTicket != 0) {
				confirmTicket = decrementTicketCount(confirmTicket);
				return "Ticket Confirmed";
			} else {
				waitingList = decrementTicketCount(waitingList);
				return "Waiting List";
			}
		}

		else {
			if(NonAcCoach.confirmTicket != 0 || NonAcCoach.waitingList != 0 || SeaterCoach.confirmTicket != 0 || SeaterCoach.waitingList != 0) {
				System.out.println("Sorry no tickets available in Non-Ac Coach. Try again some other day.");
				return " ";
			}
			else {
				System.out.println("No tickets available in any coach. Try again some other day.");
				return "No";
			}
		}
	}
}
