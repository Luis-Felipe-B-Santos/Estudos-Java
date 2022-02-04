package program;

import java.util.Scanner;

import entities.Triangle;

public class MainUsingOoAndFunction {

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
		
		double xArea = x.area();
		
		double yArea = y.area();
		
		
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
