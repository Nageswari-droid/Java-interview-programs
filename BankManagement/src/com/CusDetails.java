package com;

import java.util.*;

public class CusDetails {

	static List<CustomerDetails> customerList = CustomerDataBase.listDataBase;

	public static void printAccountNumber(long cusNumber) {
		System.out.println("Your account - " + cusNumber + " is created successfully!");

	}

	public static void deleteAcc(long accNum) {
		int flag = 0;
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getAccountNumber() == accNum) {
				flag = 1;
				CustomerDetails customer = customerList.get(i);
				customerList.remove(customer);
				System.out.println("Your account - " + accNum + " is deleted successfully!");
			}
		}

		if (flag == 0) {
			System.out.println("Account not found!");
		}
	}

	public static void transactionMethod(long accNumber) {
		Scanner obj = new Scanner(System.in);
		int flag = 0;
		int temp = 0;
		for (int i = 0; i < customerList.size(); i++) {
			CustomerDetails customer = customerList.get(i);
			if (customer.getAccountNumber() == accNumber) {
				flag = 1;
				System.out.println("Enter receiver account number : ");
				long receiverAccNumber = obj.nextLong();

				if (receiverAccNumber == accNumber) {
					System.out.println("Same account number!!");
					System.out.println("Do you want to change the receiver account number?(Y/N)");

					char choice = obj.next().charAt(0);

					if (choice == 'Y' || choice == 'y') {
						temp = 1;
						transactionMethod(accNumber);
					} else if (choice == 'N' || choice == 'n') {
						temp = 1;
						System.out.println("Thank you!");
						break;
					} else {
						System.out.println("Invalid choice!");
					}
				}

				else {

					for (int j = 0; j < customerList.size(); j++) {
						CustomerDetails receiverCustomer = customerList.get(j);

						if (receiverCustomer.getAccountNumber() == receiverAccNumber) {
							System.out.println("Transaction amount : ");
							int amount = obj.nextInt();

							if ((amount) <= (customer.getBalance() - 1000)) {
								temp = 1;
								int receiverBalance = receiverCustomer.getBalance();
								receiverBalance = receiverBalance + amount;

								receiverCustomer.setBalance(receiverBalance);
								customer.setBalance(customer.getBalance() - amount);

								System.out.println(
										"Transaction completed!! To check your current balance press 3. Thank you :-)");
							} else {
								temp = 1;
								System.out.println("Insufficient balance to make transaction!");
								System.out.println("Your account balance is " + customer.getBalance()
										+ ". You need to deposit " + ((amount + 1000) - customer.getBalance())
										+ " rupees to make this transaction!");
								System.out.println("Thank you! Press 4 to deposit/withdraw");
								break;
							}
						}

					}
				}
			}
		}

		if (flag == 0) {
			System.out.println("Account doesn't exists, create new account!");
		}

		else if (temp == 0) {
			System.out.println("Invalid receiver account number! Check the account number...");
		}
	}

	public static void printAll() {
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i) != null) {
				CustomerDetails C = customerList.get(i);
				printCustomerDetails(C);
			}
		}
	}

	public static void print(long accNumber) {

		int temp = 1;

		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getAccountNumber() == accNumber) {
				temp = 0;
				CustomerDetails C = customerList.get(i);
				printCustomerDetails(C);
			}
		}

		if (temp == 1) {
			System.out.println("Account not found! Create new account.");
		}
	}

	public static void printBalance(long accNumber) {

		int temp = 1;

		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getAccountNumber() == accNumber) {
				temp = 0;
				System.out.println("Account Balance : " + customerList.get(i).getBalance());
			}
		}

		if (temp == 1) {
			System.out.println("Account not found! Create new account.");
		}
	}

	public static void deposit(long accNumber, int amt) {
		int flag = 0;
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getAccountNumber() == accNumber) {
				flag = 1;
				CustomerDetails customer = customerList.get(i);
				int accBalance = customer.getBalance();
				accBalance = accBalance + amt;

				customer.setBalance(accBalance);

				System.out.println("Amount deposited successfully!");
				System.out.println("Current balance : " + accBalance);
			}
		}
	}

	public static void withdraw(long accNumber, int amt) {
		int flag = 0;
		int accBalance = 0;

		Scanner obj = new Scanner(System.in);

		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getAccountNumber() == accNumber) {
				flag = 1;
				CustomerDetails customer = customerList.get(i);
				accBalance = customer.getBalance();

				if ((accBalance - 1000) > amt) {
					accBalance = accBalance - amt;
					customer.setBalance(accBalance);

					System.out.println("Amount withdrew successfully!");
					System.out.println("Current balance : " + accBalance);
				} else {
					System.out.println("Insufficient balance!!");
					System.out.println("Do you want to change your withdrawal amount?(Y/N)");
					char opt = obj.next().charAt(0);

					if (opt == 'Y') {
						System.out.println("Enter the amount : ");
						int amount = obj.nextInt();
						CusDetails.withdraw(accNumber, amount);
					} else {
						System.out.println("Thank you!");
					}
				}
			}
		}
	}

	public static void printCustomerDetails(CustomerDetails C) {
		System.out.println("Customer Details");
		System.out.println("----------------");
		System.out.println("Account Number : " + C.getAccountNumber());
		System.out.println("Name : " + C.getName());
		System.out.println("Age : " + C.getAge());
		System.out.println("Balance : " + C.getBalance());
		System.out.println("Account type : " + C.getAccount());
	}
}
