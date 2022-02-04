package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Enter product data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println(product.toString());

		boolean x = false;

		do {
			System.out.printf("Do you wish to add any number of %s to the stock? (Y/N) %n", product.getName());
			
			char response = sc.next().charAt(0);
			response = Character.toUpperCase(response);
			
			if (response == 'Y') {
				System.out.println("How many products do you wish to add to stock?");
				int quant = sc.nextInt();
				product.addProducts(quant);
				System.out.println("Updated list: " + product.toString());
				x = true;
			} else if (response == 'N') {
				System.out.println("Ok");
				x = true;
			} else {
				System.out.println("That's not a valid answer");
			}
		} while (x == false);

		x = false;

		do {
			System.out.printf("Do you wish to remove any number of %s from stock? %n (Y/N)", product.getName());
			char response = sc.next().charAt(0);
			response = Character.toUpperCase(response);
			
			if (response == 'Y') {
				System.out.println("How many products do you wish to remove from stock?");
				int quant = sc.nextInt();
				product.removeProducts(quant);
				System.out.println("Updated list: " + product.toString());
				x = true;
			} else if (response == 'N') {
				System.out.println("Ok");
				x = true;
			} else {
				System.out.println("That's not a valid answer");
			}
		} while (x == false);

		sc.close();
	}

}
