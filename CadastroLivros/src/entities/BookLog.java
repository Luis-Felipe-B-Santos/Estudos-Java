package entities;

public class BookLog {
	
	private String title;
	private int year;
	private int pages;
	private double price;
	
	public BookLog() {
		
	}
	
	public BookLog(String title, int year, int pages, double price) {
		this.title = title;
		this.year = year;
		this.pages = pages;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getPages() {
		return pages;
	}
	
	public double getPrice() {
		return price;
	}
}
