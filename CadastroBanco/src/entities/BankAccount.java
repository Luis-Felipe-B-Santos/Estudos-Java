package entities;

public class BankAccount {
	
	private int accountNumber;
	private String accountTitular;
	private double accountValue;
	private static final double TAX = 5.00;
	
	public BankAccount(int accountNumber, String accountTitular, double accountValue) {
		this.accountNumber = accountNumber;
		this.accountTitular = accountTitular;
		this.accountValue = accountValue;
	}

	public BankAccount(int accountNumber, String accountTitular) {
		super();
		this.accountNumber = accountNumber;
		this.accountTitular = accountTitular;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountTitular() {
		return accountTitular;
	}

	public void setAccountTitular(String accountTitular) {
		this.accountTitular = accountTitular;
	}

	public double getAccountValue() {
		return accountValue;
	}

	public void deposit(double value) {
		accountValue += value;
	}
	
	public void withdrawal(double value) {
		accountValue -= (value + TAX);
	}
	
	public String toString() {
		return 
		"Account information" +
		System.lineSeparator() +
		"Number: " +
		getAccountNumber() +
		System.lineSeparator() +
		"Holder: " +
		getAccountTitular() +
		System.lineSeparator() +
		"Balance: $" +
		String.format("%.2f", getAccountValue());
	}
}
