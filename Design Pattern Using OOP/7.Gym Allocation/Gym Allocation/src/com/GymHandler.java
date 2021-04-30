package com;

import java.util.*;
import printer.Output;

public class GymHandler {
	
	static int trainerCount = 5;
	
	private static List<Trainer> seedTrainerSlot() {
		List<Trainer> trainerList = new ArrayList<>();
		
		for(int i = 1 ; i <= trainerCount ; i++ ) {
			Trainer trainer = new Trainer(i, "Trainer - " + i);
			trainerList.add(trainer);
		}
		
		return trainerList;
	}
	
	public static void main(String args[]) {
		List<Trainer> trainerList = seedTrainerSlot();
		
		Output.displayConsoleNewLine("Welcome\n");
		int i = 1;
		
		while(i <= 6) {
			Customer customer = new Customer(i);
			
			Scanner scanner = new Scanner(System.in);
			Output.displayConsoleSingleLine("Enter number of slots required per day : ");
			
			int numOfSlots = scanner.nextInt();
			AllocateSlot.allocateGymTrainer(customer,trainerList ,numOfSlots);
			Output.displayConsoleNewLine("\n");
		}
	}
}
