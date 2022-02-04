package program;

import java.util.Scanner;

import entities.Triangle;

public class MainUsingOo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y; 
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Type the sizes of X triangle: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Type the sizes of Y triangle: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2;
		double xArea = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2;
		double yArea = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		
		System.out.printf("X triangle area : %.4f %n", xArea);
		System.out.printf("Y triangle area : %.4f %n", yArea);
		
		if (xArea > yArea) {
			System.out.println("Triangle X is bigger");
		}
		else {
			System.out.println("Triangle Y is bigger");
		}
		
		sc.close();

	}

}
