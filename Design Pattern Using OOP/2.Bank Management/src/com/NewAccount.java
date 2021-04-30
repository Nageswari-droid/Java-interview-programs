package com;

import java.util.*;

public class NewAccount {

	public static void createAccount() {

		int age, balance;
		String name, accountType;

		Scanner obj = new Scanner(System.in);
		
		System.out.println("Account details");
		System.out.println("----------------");
		System.out.println("Name : ");
		name = obj.next();
		System.out.println("Age : ");
		age = obj.nextInt();
		System.out.println("Initial amount : (>= 5000) ");
		balance = obj.nextInt();
		System.out.println("Account type : ");
		accountType = obj.next();

		long min = 1000000000000L;
		long max = 10000000000000L;
		Random random = new Random();
		long number = min + ((long) (random.nextDouble() * (max - min)));

		accDetails(name, age, balance, accountType, number);

	}

	public static void accDetails(String cusName, int cusAge, int cusBalance, String cusAccountType, long cusNumber) {
		Scanner obj = new Scanner(System.in);
		if (cusBalance < 5000) {
			System.out.println("Initial amount has to be minimum 5000!");
			System.out.println("Would you like to change the amount?(Y/N)");

			char choice = obj.next().charAt(0);

			if (choice == 'Y') {
				System.out.println("Enter the initial amount : (>= 5000)");
				cusBalance = obj.nextInt();
				accDetails(cusName, cusAge, cusBalance, cusAccountType, cusNumber);
			} else {
				OutputClass.welcomeScreen();
			}
		} else {
			CustomerDetails classObj = new CustomerDetails(cusName, cusAge, cusBalance, cusAccountType, cusNumber);
			CustomerDataBase.customerDB(classObj);
			classObj.setName(cusName);
			classObj.setAge(cusAge);
			classObj.setBalance(cusBalance);
			classObj.setAccount(cusAccountType);

			CusDetails.printAccountNumber(cusNumber);
			OutputClass.welcomeScreen();
		}
	}
}
