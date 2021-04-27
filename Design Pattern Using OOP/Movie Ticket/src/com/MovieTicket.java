package com;

import shows.ShowOne;
import shows.ShowTwo;

public class MovieTicket {

	public static void main(String args[]) {
		int i = 1;
		ShowOne showOne = new ShowOne();
		ShowTwo showTwo = new ShowTwo();
		
		showOne.printTickets();
		showTwo.printTickets();
		
		while(i <= 10) {
			BookTicket.bookTicketWithShow();
			i++;
		}
	}
}
