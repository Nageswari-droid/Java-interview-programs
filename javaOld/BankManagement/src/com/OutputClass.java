package com;

import java.util.*;

public class OutputClass {
	public static void welcomeScreen() {
		System.out.println("");
		System.out.println("Welcome to ICICI bank!");
		System.out.println("Choose any one of the option from below ( 1 - 7 )");
		System.out.println("1. Create new account");
		System.out.println("2. Print my account details");
		System.out.println("3. Check the balance of your exisiting account");
		System.out.println("4. Deposit / withdraw");
		System.out.println("5. Print all customer details");
		System.out.println("6. Delete exisiting account");
		System.out.println("7. Transaction");
		System.out.println("");

		Scanner obj = new Scanner(System.in);
		int choice = obj.nextInt();

		switch (choice) {
		case 1: {
			NewAccount.createAccount();
			break;
		}
		case 2: {
			System.out.println("Enter your account number : ");
			long accNumber = obj.nextLong();
			CusDetails.print(accNumber);
			welcomeScreen();
			break;
		}
		case 3: {
			System.out.println("Enter your account number : ");
			long accNumber = obj.nextLong();
			CusDetails.printBalance(accNumber);
			welcomeScreen();
			break;
		}
		case 4: {
			System.out.println("Enter your account number : ");
			long accNumber = obj.nextLong();
			SavingWithdraw.savings(accNumber);
			welcomeScreen();
			break;
		}
		case 5: {
			CusDetails.printAll();
			welcomeScreen();
			break;
		}
		case 6: {
			System.out.println("Enter your account number : ");
			long accNumber = obj.nextLong();
			CusDetails.deleteAcc(accNumber);
			welcomeScreen();
			break;
		}
		case 7: {
			System.out.println("Enter your account number : ");
			long accNumber = obj.nextLong();
			CusDetails.transactionMethod(accNumber);
			welcomeScreen();
			break;
		}
		default: {
			System.out.println("Invalid choice");
			welcomeScreen();
			break;
		}
		}
	}
}
