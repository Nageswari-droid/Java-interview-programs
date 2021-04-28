package com;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int customerId;
	
	private List<Trainer> trainerList;
	private List<String> trainerName;
	
	public Customer(int customerId) {
		this.customerId = customerId;
		this.trainerList = new ArrayList<>();
		this.trainerName = new ArrayList<>();
	}
	
	public void setTrainer(Trainer trainer) {
		trainerList.add(trainer);
	}
	
	public List<Trainer> getTrainerDetails() {
		return trainerList;
	}
}
