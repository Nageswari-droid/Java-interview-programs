package com;

import java.io.IOException;

public class OutputClass {
	public void printUserChoices() throws IOException {
		System.out.println();
		System.out.println("Welcome to railway reservation!!");
		System.out.println();
		System.out.println("Choose your option given below (1 - 3)");
		System.out.println();
		System.out.println("1. Ticket booking");
		System.out.println("2. Ticket cancellation");
		System.out.println("3. Status checking");
		System.out.println();
	}

	public void printUserDetails() throws IOException {
		System.out.println();
		System.out.println("Enter below details for booking your ticket");
		System.out.println();
		System.out.println("Enter your name");
		System.out.println("Enter your age");
		System.out.println("Enter coach preference\n1.Ac\n2.Non-AC\n3.Seater");
		System.out.println("Enter the from station name (A,B,C,D,E,F)");
		System.out.println("Enter the to station name (A,B,C,D,E,F)");
		System.out.println();
	}

	public void printInvalidChoice(String err) throws IOException {
		System.out.println();
		System.out.println("Invalid " + err +" choice");
		System.out.println("Do you want to change?(Y/N)");
		System.out.println();
	}
	
	public void printThankYou() throws IOException{
		System.out.println("Thank you, Welcome again...");
		printUserChoices();
	}
	
	public void wrongChoice(String err) throws IOException{
		if(err.equals("coach")) {
			System.out.println("Enter coach preference\\n1.Ac\\n2.Non-AC\\n3.Seater");
		}
	}
}
