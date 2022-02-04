package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		double total = quantity * price;
		return total;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity; // o this.algo é reservado para se referir ao atributo algo da classe,
									// diferenciando palavras iguais
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return  name + 
				", $" + 
				String.format("%.2f", price) + 
				", " + 
				quantity + 
				" units, Total: $" +
				String.format("%.2f", totalValueInStock());
	}
}
