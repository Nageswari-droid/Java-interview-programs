package com;

public class NonAcCoach extends Coach {

	private static int confirmTicket = 60;
	private static int waitingList = 10;

	public void ticketCount() {
		if (confirmTicket != 0) {
			confirmTicket = super.ticketCount(confirmTicket);
		} else {
			waitingList = super.ticketCount(waitingList);
		}
	}

}
