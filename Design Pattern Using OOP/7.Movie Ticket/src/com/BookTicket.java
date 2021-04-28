package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import printer.Output;
import shows.Shows;

public class BookTicket {
	private static int count = 1;

	public static void bookTicketWithShow(List<Shows> allShowsList) {
		Scanner scanner = new Scanner(System.in);
		int showNumber;
		String seats;
		
		Shows showsChoice = null;

		Output.displayConsoleOutputNewLine("Group" + count + ": -");
		Output.displayConsoleOutputSingleLine("Enter show number :- ");
		showNumber = scanner.nextInt();
		for (int j = 0; j < allShowsList.size(); j++) {
			int showName = allShowsList.get(j).getShowNumber();
			if(showName == showNumber) {
				showsChoice = allShowsList.get(j); 
			}
		}
		if (showsChoice.checkTicketAvailability()) {
			Output.displayConsoleOutputSingleLine("Enter seats :- ");
			seats = scanner.next();

			List<String> bookSeatList = new ArrayList<>(Arrays.asList(seats.split("\\s*,\\s*")));

			String outputMessage = showsChoice.bookTicket(bookSeatList);

			if (outputMessage.equals("Successfully Booked")) {
				Output.displayConsoleOutputNewLine("Print :- " + outputMessage);
				showsChoice.printAvailableSeats();
				showsChoice.printBookedSeats();
			} else {
				Output.displayConsoleOutputNewLine("Print :- " + outputMessage);
				showsChoice.printAvailableSeats();
				Output.displayConsoleOutputNewLine("\n");
			}
		} 
		else {
			Output.displayConsoleOutputNewLine("Show "+showsChoice.getShowNumber() + " tickets are filled. Try some other show");
			Output.displayConsoleOutputNewLine("\n");
		}
		
		count++;
	}
}
