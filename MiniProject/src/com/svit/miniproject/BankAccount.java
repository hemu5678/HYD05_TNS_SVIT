package com.svit.miniproject;

public class BankAccount {
	private int accountNumber; 
	   private String accountHolderName; 
	   private double balance; 

	   public void createAccount(int accountNumber, String accountHolderName) { 
	      this.accountNumber = accountNumber; 
	      this.accountHolderName = accountHolderName; 
	      this.balance = 0.0; 
	      System.out.println("Account created successfully!"); 
	   } 
	   public void deposit(int accountNumber, double depositAmount) { 
	      if (this.accountNumber == accountNumber) { 
	         this.balance += depositAmount; 
	         System.out.println("Deposit successful!"); 
	      } else { 
	         System.out.println("Invalid account number!"); 
	      } 
	   } 
	   public void withdraw(int accountNumber, double withdrawAmount) { 
	      if (this.accountNumber == accountNumber) { 
	         if (this.balance >= withdrawAmount) { 
	            this.balance -= withdrawAmount; 
	            System.out.println("Withdrawal successful!"); 
	         } else { 
	            System.out.println("Insufficient balance!"); 
	         } 
	      } else { 
	         System.out.println("Invalid account number!"); 
	      } 
	   } 
	   public void transfer(int sourceAccountNumber, int destinationAccountNumber, double transferAmount) { 
	      if (this.accountNumber == sourceAccountNumber) { 
	         if (this.balance >= transferAmount) { 
	            this.balance -= transferAmount; 
	            System.out.println("Transfer from " + sourceAccountNumber + "to " + destinationAccountNumber + " successful!"); 
	            BankAccount destinationAccount = findAccount(destinationAccountNumber); 
	            
	            if (destinationAccount != null) { 
	               destinationAccount.balance += transferAmount; 
	            } 
	         } else { 
	            System.out.println("Insufficient balance!"); 
	         } 
	      } else { 
	         System.out.println("Invalid account number!");
	      } 
	   } 
	   public double getBalance(int accountNumber) { 
	      if (this.accountNumber == accountNumber) { 
	         return this.balance; 
	      } else { 
	         System.out.println("Invalid account number!"); 
	         return 0.0; 
	      } 
	   } 
	   // helper method to find account by account number 

	   private BankAccount findAccount(int accountNumber) { 
	      // in a real application, this method would typically search a database 
	      // or other data store to find the account with the given account number 
	      // for simplicity in this example, we just assume that we only have a few 
	      // accounts and they are stored in an array 
	      BankAccount[] accounts = {this}; 
	      for (BankAccount account : accounts) { 
	         if (account.accountNumber == accountNumber) { 
	            return account; 
	         } 
	      } 
	      return null; 
	   } 
	}

