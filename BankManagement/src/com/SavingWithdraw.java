package com;

import java.util.*;

public class SavingWithdraw {

	static List<CustomerDetails> customerDetails = CustomerDataBase.listDataBase;

	public static void savings(long accNumber) {

		int flag = 0;
		
		for (int i = 0; i < customerDetails.size(); i++) {
			if (customerDetails.get(i).getAccountNumber() == accNumber) {
				
				flag = 1;
				
				System.out.println();
				System.out.println("Choose your option :");
				System.out.println("1.Deposit");
				System.out.println("2. Withdraw");

				Scanner obj = new Scanner(System.in);

				int choice = obj.nextInt();

				System.out.println("Enter the amount : ");

				int amt = obj.nextInt();

				switch (choice) {
				case 1: {
					CusDetails.deposit(accNumber, amt);
					OutputClass.welcomeScreen();
					break;
				}
				case 2: {
					CusDetails.withdraw(accNumber, amt);
					OutputClass.welcomeScreen();
//					if (result == 0) {
//						System.out.println("Do you want to change your withdrawal amount?(Y/N)");
//						char opt = obj.next().charAt(0);
//
//						if (opt == 'Y') {
//							System.out.println("Enter the amount : ");
//							int amount = obj.nextInt();
//							result = CusDetails.withdraw(accNumber, amount);
//						} else {
//							System.out.println("Thank you!");
//							OutputClass.welcomeScreen();
//						}
//					} else {
//						System.out.println("Amount withdrew successfully!");
//						System.out.println("Current balance : " + result);
//					}

					break;
				}
				}
			}
		}
		
		if(flag == 0) {
			System.out.println("Account not found! Create new account.");
		}

	}

}
