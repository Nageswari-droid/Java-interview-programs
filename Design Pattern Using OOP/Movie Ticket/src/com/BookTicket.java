package com;

import printer.Output;
import shows.IShows;
import java.util.*;

public class BookTicket {
	private static int count = 1;

	public static void bookTicketWithShow() {
		Scanner scanner = new Scanner(System.in);
		int showNumber;
		String seats;
		
		Output.displayConsoleOutputNewLine("Group" + count + ": -");
		Output.displayConsoleOutputSingleLine("Enter show number :- ");
		showNumber = scanner.nextInt();
		Output.displayConsoleOutputSingleLine("Enter seats :- ");
		seats = scanner.next();
	
		List<String> bookSeatList = new ArrayList<>(Arrays.asList(seats.split("\\s*,\\s*")));
		
		IShows showsChoice = ShowFactory.getInstance(showNumber);
		String outputMessage = showsChoice.bookTicket(bookSeatList);
		
		if(outputMessage.equals("Successfully Booked")) {
			Output.displayConsoleOutputNewLine("Print :- " + outputMessage);
			showsChoice.printAvailableSeats();
			showsChoice.printBookedSeats();
		}else {
			Output.displayConsoleOutputNewLine("Print :- " + outputMessage);
			showsChoice.printAvailableSeats();
			Output.displayConsoleOutputNewLine("\n");
		}
		
		count++;
	}
}
