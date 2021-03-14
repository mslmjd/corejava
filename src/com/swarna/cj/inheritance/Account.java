package com.swarna.cj.inheritance;
import static com.swarna.cj.inheritance.MaskUtil.*;

public class Account {
	
	long accNumber;
	String name;
	double balance;
	
	public Account(long accNumber, String name, double balance) {
	
		this.accNumber = accNumber;
		name = name;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		if(amount<=balance) {
			this.balance-=amount;
			System.out.println("After withdraw of"+amount+"the balance in account"+mask(accNumber)+"is "+balance);
		}
		else {
			System.out.println("You don't have Sufficient funds in account :"+mask(accNumber)+"Your balance is :"+balance);
		}
			
	}
	
	public void deposit(double amount) {
		this.balance+=amount;
		System.out.println("After deposit of "+amount+"The balance in account "+mask(accNumber)+"is "+balance );
		
	}
	
	public void showInfo() {
		System.out.println("Accout Number : "+accNumber);
		System.out.println("Name          :"+name);
		System.out.println("Balance       :"+balance);
	}
	

}
