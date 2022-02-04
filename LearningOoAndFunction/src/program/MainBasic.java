package program;

import java.util.Scanner;

public class MainBasic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] xTri, yTri;
		xTri = new double[3];
		yTri = new double[3];
		
		System.out.println("Type the sizes of X triangle: ");
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("Size %d: %n", i+1);
			xTri[i] = sc.nextDouble();
		}
		System.out.println("Type the sizes of Y triangle: ");
		
		for (int i = 0; i < 3; i++ ) {
			System.out.printf("Size %d: %n", i+1);
			yTri[i] = sc.nextDouble();
		}
		
		double xAreaPre, yAreaPre, xArea, yArea, p1, p2;
		
		p1 = (xTri[0] + xTri[1] + xTri[2]) / 2;
		p2 = (yTri[0] + yTri[1] + yTri[2]) / 2;
		
		xAreaPre = p1 * (p1 - xTri[0]) * (p1 - xTri[1]) * (p1 - xTri[2]);
		yAreaPre = p2 * (p2 - yTri[0]) * (p2 - yTri[1]) * (p2 - yTri[2]);
		
		xArea = Math.sqrt(xAreaPre);
		yArea = Math.sqrt(yAreaPre);
		
		System.out.printf("X triangle area : %.2f %n", xArea);
		System.out.printf("Y triangle area : %.2f %n", yArea);
		
		if (xArea > yArea) {
			System.out.println("Triangle X is bigger");
		}
		else {
			System.out.println("Triangle Y is bigger");
		}
		
		sc.close();

	}

}
