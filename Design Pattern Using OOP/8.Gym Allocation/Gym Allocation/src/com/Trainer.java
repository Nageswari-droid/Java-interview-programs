package com;

public class Trainer {
	private int trainerId;
	private int trainerSlot = 2;
	private String trainerName;
	
	public Trainer(int trainerId, String trainerName) {
		this.trainerId = trainerId;
		this.trainerName = trainerName;
	}
	
	public String getName() {
		return trainerName;
	}
	
	public int getTrainerId() {
		return trainerId;
	}
	
	public void deduceSlot(int slot) {
		trainerSlot = trainerSlot - slot;
	}
	
	public int getAvailableSlot() {
		return trainerSlot;
	}
}
