package program;

import java.util.Scanner;

import entities.BookLog;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String title;
		int year, pages;
		double price;

		System.out.println("How many books do you wish to log in the system? ");
		int numberOfBooks = sc.nextInt();

		BookLog[] books = new BookLog[numberOfBooks];

		for (int i = 0; i < books.length; i++) {
			sc.nextLine();
			System.out.print("Title of the book: ");
			title = sc.nextLine();
			System.out.print("Year of publication: ");
			year = sc.nextInt();
			System.out.print("Number of pages: ");
			pages = sc.nextInt();
			System.out.print("Price: ");
			price = sc.nextDouble();
			books[i] = new BookLog(title, year, pages, price);
		}

		for (int i = 0; i < books.length; i++) {
			System.out.println("Book: " + books[i].getTitle());
			System.out.println("Year of publication: " + books[i].getYear());
			System.out.println("Number of pages: " + books[i].getPages());
			System.out.println("Price: $" + books[i].getPrice());
		}

		sc.close();
	}

}
