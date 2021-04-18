package com;

import java.util.*;

public class PassengerList {
	static List<PassengerDB> confirmList = new ArrayList<>();
	static List<PassengerDB> waitingList = new ArrayList<>();
	
	public static void addList(PassengerDB db, String status) {
		if(status.equals("Ticket Confirmed")) {
			confirmList.add(db);
		}else {
			waitingList.add(db);
		}
	}
}
