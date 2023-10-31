package com.svit.miniproject;

import java.util.Scanner;
public class BankingApplication {
	public static void main(String[] args) { 
	      BankAccount bankAccount = new BankAccount(); 
	      int choice; 
	      do { 
	         System.out.println("1. Create Account"); 
	         System.out.println("2. Deposit"); 
	         System.out.println("3. Withdraw"); 
	         System.out.println("4. Transfer"); 
	         System.out.println("5. Check Balance"); 
	         System.out.println("0. Exit"); 
	         System.out.println("Enter your choice:"); 
	         Scanner scanner = new Scanner(System.in); 
	         choice = scanner.nextInt(); 

	         switch (choice) { 
	            case 1: 
	               System.out.println("Enter account number:"); 
	               int accountNumber = scanner.nextInt(); 
	               System.out.println("Enter account holder name:"); 
	               String accountHolderName = scanner.next(); 
	               bankAccount.createAccount(accountNumber, accountHolderName); 
	               break; 

	            case 2: 
	               System.out.println("Enter account number:"); 
	               accountNumber = scanner.nextInt(); 
	               System.out.println("Enter deposit amount:"); 
	               double depositAmount = scanner.nextDouble(); 
	               bankAccount.deposit(accountNumber, depositAmount); 
	               break; 

	            case 3: 
	               System.out.println("Enter account number:"); 
	               accountNumber = scanner.nextInt(); 
	               System.out.println("Enter withdraw amount:"); 
	               double withdrawAmount = scanner.nextDouble(); 
	               bankAccount.withdraw(accountNumber, withdrawAmount); 
	               break; 

	            case 4: 
	               System.out.println("Enter source account number:"); 
	               int sourceAccountNumber = scanner.nextInt(); 
	               System.out.println("Enter destination account number:"); 
	               int destinationAccountNumber = scanner.nextInt(); 
	               System.out.println("Enter transfer amount:"); 
	               double transferAmount = scanner.nextDouble(); 
	               bankAccount.transfer(sourceAccountNumber, destinationAccountNumber, transferAmount); 
	               break; 
	            case 5: 
	               System.out.println("Enter account number:"); 
	               accountNumber = scanner.nextInt(); 
	               System.out.println("Balance: " + bankAccount.getBalance(accountNumber)); 
	               break; 

	            case 0: 
	               System.out.println("Exiting..."); 
	               break; 
	               
	            default: 
	               System.out.println("Invalid choice"); 
	               break; 

	          } 
	      } while (choice != 0); 

	   } 

	} 

