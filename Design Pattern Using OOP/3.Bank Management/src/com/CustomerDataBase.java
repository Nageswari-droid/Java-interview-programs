package com;

import java.util.*;

public class CustomerDataBase {
	
	static List<CustomerDetails> listDataBase = new ArrayList<CustomerDetails>();
	
	public static void customerDB(CustomerDetails C) {
		listDataBase.add(C);
	}
}
