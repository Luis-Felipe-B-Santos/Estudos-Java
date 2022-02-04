package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employees> list = new ArrayList<>();
		
		System.out.print("Enter number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter employee %d: %n", i+1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employees emp = new Employees(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.print("Enter employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		Integer pos = position(list, idSalary);
		
		if (pos == null) {
			System.out.println("Id does not exist");
		}
		else {
			System.out.print("Percentage to increase salary: ");
			Double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		System.out.println();
		System.out.println("List of employees: ");
		
		for (Employees emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	public static Integer position(List<Employees> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
