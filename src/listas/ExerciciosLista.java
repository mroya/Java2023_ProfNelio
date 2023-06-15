package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExerciciosLista {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			// Validar se já existe o id na lista, se existir informa e pede para inserir
			// novamente
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Employee emp = new Employee(id, name, salary);

			list.add(emp);
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idEmployee = sc.nextInt();

		/*
		 * Versão usando a forma mais simples com stream usando a função filter
		 * 
		 * Employee emp = list.stream().filter(x -> x.getId() ==
		 * idEmployee).findFirst().orElse(null); if (emp == null) {
		 * System.out.println("This is does not exists!"); } else {
		 * System.out.println("Enter the percentage: "); }
		 */

		Integer pos = position(list, idEmployee);
		if (pos == null) {
			System.out.println("This is does not exists!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employess:");

		for (Employee emp : list) {
			System.out.println(emp);
		}

		sc.close();
	}

	private static boolean hasId(List<Employee> list, Integer id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
