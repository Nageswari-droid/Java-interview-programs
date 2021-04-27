package shows;

import java.util.List;

public interface IShows {
	public String bookTicket(List<String> arrayList);
	public boolean validateSeats(List<String> arrayList);
	public void printAvailableSeats();
	public void printBookedSeats();
	public void printTickets();
}
