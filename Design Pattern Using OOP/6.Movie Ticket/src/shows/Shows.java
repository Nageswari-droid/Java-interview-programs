package shows;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import printer.Output;

public class Shows implements IShows {
	private final int showName;
	private final List<String> seatsAvailable;
	private List<String> bookedSeats;

	public Shows(int showName, List<String> seatsAvailable) {
		this.showName = showName;
		this.seatsAvailable = seatsAvailable;
		this.bookedSeats = new ArrayList<>();
	}

	@Override
	public String bookTicket(List<String> seatsYetToBooked) {

		Boolean flag = validateSeats(seatsYetToBooked);
		if (flag) {
			for (int i = 0; i < seatsYetToBooked.size(); i++) {
				bookedSeats.add(seatsYetToBooked.get(i));
			}
			return "Successfully Booked";
		} else {
			return "Seat you selected is not available please try again. ";
		}
	}

	@Override
	public void printTickets() {
		Output.displayConsoleOutputNewLine("Show " + showName);

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
			for (Map.Entry<Integer, String> entry : tempList.entrySet()) {
				String value = entry.getValue();
				for (int i = 0; i < seatsAvailable.size(); i++) {
					if (value.equals(seatsAvailable.get(i))) {
						seatsAvailable.remove(i);
					}
				}
			}

			return true;
		} else {
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
		if (seatsAvailable.size() > 0) {
			for (int i = 0; i < seatsAvailable.size(); i++) {
				Output.displayConsoleOutputSingleLine(seatsAvailable.get(i));
				if (i != seatsAvailable.size() - 1) {
					Output.displayConsoleOutputSingleLine(" , ");
				}
			}
		} else {
			Output.displayConsoleOutputSingleLine("No tickets available");
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

	@Override
	public boolean checkTicketAvailability() {
		if (seatsAvailable.size() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public int getShowNumber() {
		return showName;
	}

}
