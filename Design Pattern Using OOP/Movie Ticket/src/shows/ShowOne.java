package shows;

import java.util.*;
import printer.Output;

public class ShowOne implements IShows {

	private static List<String> seatsAvailable = new ArrayList<>(
			Arrays.asList("A1", "A2", "A3", "A4", "A5", "A6", "A9"));
	private static List<String> bookedSeats = new ArrayList<>();

	@Override
	public String bookTicket(List<String> seatsYetToBooked) {
		
		Boolean flag = validateSeats(seatsYetToBooked);
		if(flag) {
			for(int i = 0 ; i < seatsYetToBooked.size() ; i++) {
				bookedSeats.add(seatsYetToBooked.get(i));
			}
			return "Successfully Booked";
		}else {
			return "Seat you selected is not available please try again. ";
		}
	}

	@Override
	public void printTickets() {
		Output.displayConsoleOutputNewLine("Show 1 : ");

		printAvailableSeats();
		Output.displayConsoleOutputNewLine("\n");
	}

	@Override
	public boolean validateSeats(List<String> seatsYetToBooked) {
		Map<Integer, String> tempList = new HashMap<>();
		for (int i = 0; i < seatsYetToBooked.size(); i++) {
			String seats = seatsYetToBooked.get(i);
			for (int j = 0; j < seatsAvailable.size(); j++) {
				if (seats.contains(seatsAvailable.get(j))) {
					tempList.put(j, seats);
				}
			}
		}
		
		if (tempList.size() == seatsYetToBooked.size()) {
			for(Map.Entry<Integer,String> entry : tempList.entrySet()) {
				String value = entry.getValue();
				for(int i = 0 ; i < seatsAvailable.size() ; i++) {
					if(value.equals(seatsAvailable.get(i))) {
						seatsAvailable.remove(i);
					}
				}
			}
			
			return true;
		}
		else {
			for (int i = 0; i < seatsYetToBooked.size(); i++) {
				String seats = seatsYetToBooked.get(i);
				for (int j = 0; j < bookedSeats.size(); j++) {
					if (seats.contains(bookedSeats.get(j))) {
						return false;
					}
				}
			}
		}
		return false;
	}

	@Override
	public void printAvailableSeats() {
		Output.displayConsoleOutputNewLine("Available Tickets : ");
		for (int i = 0; i < seatsAvailable.size(); i++) {
			Output.displayConsoleOutputSingleLine(seatsAvailable.get(i));
			if (i != seatsAvailable.size() - 1) {
				Output.displayConsoleOutputSingleLine(" , ");
			}
		}
		Output.displayConsoleOutputSingleLine("\n");
	}

	@Override
	public void printBookedSeats() {
		Output.displayConsoleOutputNewLine("Booked Tickets : ");
		for (int i = 0; i < bookedSeats.size(); i++) {
			Output.displayConsoleOutputSingleLine(bookedSeats.get(i));
			if (i != bookedSeats.size() - 1) {
				Output.displayConsoleOutputSingleLine(" , ");
			}
		}
		
		Output.displayConsoleOutputNewLine("\n");
	}

}
