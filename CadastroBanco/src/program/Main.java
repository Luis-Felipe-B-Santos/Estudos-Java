package program;

import java.util.Scanner;

import entities.BankAccount;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int accNumber;
		double accValue, value;
		String accTitular;
		boolean x = false;
		BankAccount acc;
		
		System.out.print("Enter account Holder: ");
		accTitular = sc.nextLine();
		
		System.out.print("Enter account number: ");
		accNumber = sc.nextInt();
		
		acc = new BankAccount(accNumber, accTitular);
		
		do {
			System.out.println("Do you wish to add a initial deposit in the account? (Y/N)");
			
			char response = sc.next().charAt(0);
			response = Character.toUpperCase(response);
			
			if (response == 'Y') {
				System.out.print("Initial account value: ");
				accValue = sc.nextDouble();
				acc.deposit(accValue);
				System.out.println(acc.toString());
				x = true;
			} else if (response == 'N') {
				System.out.println("Ok");
				System.out.println(acc.toString());
				x = true;
			} else {
				System.out.println("That's not a valid answer");
			}
		} while (x == false);
		
		x = false;
		
		do {
			System.out.println("Do you wish to make a deposit? (Y/N)");
			char response = sc.next().charAt(0);
			response = Character.toUpperCase(response);
			
			if (response == 'Y') {
				System.out.print("Amount to be deposited: ");
				value = sc.nextDouble();
				acc.deposit(value);
				System.out.println(acc.toString());
				x = true;
			} else if (response == 'N') {
				System.out.println("Ok");
				System.out.println(acc.toString());
				x = true;
			} else {
				System.out.println("That's not a valid answer");
			}
		} while (x == false);
		
		x = false;
		
		do {
			System.out.println("Do you wish to withdraw any value? (Y/N)");
			char response = sc.next().charAt(0);
			response = Character.toUpperCase(response);
			
			if (response == 'Y') {
				System.out.print("Amount to be withdrawn: ");
				value = sc.nextDouble();
				acc.withdrawal(value);
				System.out.println(acc.toString());
				x = true;
			} else if (response == 'N') {
				System.out.println("Ok");
				System.out.println(acc.toString());
				x = true;
			} else {
				System.out.println("That's not a valid answer");
			}
		} while (x == false);
		
		sc.close();
	}

}
