package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import shows.Shows;

public class MovieTicket {

	private static List<Shows> seedAvailableShows() {
		List<String> showOneSeats = new ArrayList<>(Arrays.asList("A1", "A2", "A3", "A4", "A5", "A6", "A9"));
		List<String> showTwoSeats = new ArrayList<>(
				Arrays.asList("A1", "A2", "A4", "A5", "A6", "B1", "B3", "B4", "B5", "B6", "B7"));
		Shows showOne = new Shows(1, showOneSeats);
		Shows showTwo = new Shows(2, showTwoSeats);

		List<Shows> allShows = new ArrayList<>();
		allShows.add(showOne);
		allShows.add(showTwo);

		return allShows;
	}

	public static void main(String args[]) {
		int i = 1;

		List<Shows> allShowsList = seedAvailableShows();

		allShowsList.forEach(show -> {
			show.printTickets();
		});

		while (i <= 10) {
			BookTicket.bookTicketWithShow(allShowsList);
			i++;
		}
	}
}
