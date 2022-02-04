package util;

/*
 * A diferen�a entre essa classe que usa um public static � que eu n�o preciso instanciar ela,
 * eu apenas quero que uma conta seja feita e retorne meu resultado.
 */

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double converter(double dollarPrice, double ammount) {
		
		return dollarPrice * ammount * (1 + IOF);
	}
	
}
