package com;

import java.util.*;
import factory.ApplianceFactory;
import printer.DisplayConsoleOutput;
import enumerator.ElectricAppliances;
import price.Slab;

public class BillGenerator {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ApplianceFactory factory = new ApplianceFactory();
		final DisplayConsoleOutput consoleOutput = null; 
		
		int noOfAppliances;
		String applianceName = "";
		int noOfComponents;
		int perDayUse;
		int unitsPerDay  = 0;
		
		noOfAppliances = scanner.nextInt();
		
		for(int i = 0 ; i < noOfAppliances ; i++) {
			consoleOutput.displayOutput("Enter appliance name : ");
			applianceName = scanner.next();
			consoleOutput.displayOutput("Enter number of components : ");
			noOfComponents = scanner.nextInt();
			consoleOutput.displayOutput("Enter usage per day : ");
			perDayUse = scanner.nextInt();
			
			ElectricAppliances electricComponent = factory.getInstance(applianceName, noOfComponents, perDayUse);
			unitsPerDay += electricComponent.calculateUnitForSingleDay();
		}
		
		String outputMessage = "Units per day is "+ unitsPerDay;
		consoleOutput.displayOutput(outputMessage);
        int unitsPerMonth = unitsPerDay * 30;
        outputMessage = "Units per month is "+ unitsPerMonth;
        consoleOutput.displayOutput(outputMessage);
        
        Slab slab = new Slab();
        int total = slab.calculateBill(unitsPerMonth);
        outputMessage = "Total bill is "+ total;
        consoleOutput.displayOutput(outputMessage);
	}
}
