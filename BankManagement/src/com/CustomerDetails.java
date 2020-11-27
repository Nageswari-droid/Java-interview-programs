package com;

public class CustomerDetails {
	
	int age, balance;
	String name, accountType;
	long accNumber;
	
	public CustomerDetails(String name, int age, int balance, String accountType, long accNumber) {
		this.name = name;
		this.age = age;
		this.balance = balance;
		this.accountType = accountType;
		this.accNumber = accNumber;
	}
	
	public void setAccountNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	
	public long getAccountNumber() {
		return accNumber;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setAccount(String accountType) {
		this.accountType = accountType;
	}
	
	public String getAccount() {
		return accountType;
	}
}
