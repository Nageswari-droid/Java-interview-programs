package com;

import shows.IShows;
import shows.ShowOne;
import shows.ShowTwo;

public class ShowFactory {
	public static IShows getInstance(int showNumber) {
		switch (showNumber) {
		case 1:
			return new ShowOne();
		case 2:
			return new ShowTwo();
		default:
			return null;
		}
	}
}
