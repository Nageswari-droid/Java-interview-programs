package com;

import printer.Output;
import java.util.*;

public class AllocateSlot {
	private static List<Customer> customerList = new ArrayList<>();

	public static void allocateGymTrainer(Customer customer, List<Trainer> trainerList, int slots) {
		int tempSlot = slots;
		if (slots <= 3) {
			for (int i = 0; i < trainerList.size(); i++) {
				int trainerSlot = trainerList.get(i).getAvailableSlot();

				if (trainerSlot != 0) {
					int tempTrainerValue = trainerSlot > slots ? slots : trainerSlot;
					slots = slots > trainerSlot ? (slots - trainerSlot) : 0;
					customer.setTrainer(trainerList.get(i));
					trainerList.get(i).deduceSlot(tempTrainerValue);
				}
			}

			if (slots == tempSlot) {
				Output.displayConsoleNewLine("Sorry trainers are not available. Try again later.");
			} else if (slots != 0) {
				Output.displayConsoleNewLine("Trainers available for " + (tempSlot - slots) + " slots only.");
				printTrainerDetails(customer);
			} else {
				Output.displayConsoleNewLine("Trainer allocated for you successfully!");
				printTrainerDetails(customer);
			}

		} else {
			Output.displayConsoleNewLine("Maximum slot limit for each customer is 3. Change your slot limit");
		}
	}

	public static void printTrainerDetails(Customer customer) {
		Output.displayConsoleNewLine("\nTrainer Details : ");
		Output.displayConsoleNewLine("Trainer Id" + "       " + "Trainer Name");

		List<Trainer> trainerDetails = customer.getTrainerDetails();

		for (int i = 0; i < trainerDetails.size(); i++) {
			int trainerId = trainerDetails.get(i).getTrainerId();
			String trainerName = trainerDetails.get(i).getName();

			Output.displayConsoleNewLine(trainerId + "                " + trainerName);
		}

		customerList.add(customer);
	}
}
