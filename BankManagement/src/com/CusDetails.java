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
		
		if(flag == 0) {
			System.out.println("Account not found!");
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
		
		if(temp == 1) {
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
		
		if(temp == 1) {
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
				
				if((accBalance - 1000) > amt) {
					accBalance = accBalance - amt;
					customer.setBalance(accBalance);
					
					System.out.println("Amount withdrew successfully!");
					System.out.println("Current balance : " + accBalance);
				}
				else {
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
