package program;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("What is the dollar price: ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double ammount = sc.nextDouble();
		
		double result = CurrencyConverter.converter(dollarPrice, ammount); //here, no instantiation needed 
		
		System.out.printf("Amount to be paid in reais: %.2f%n", result);
		
		sc.close();

	}

}
