package metodosAbstratos.exercicios.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import metodosAbstratos.exercicios.entities.Company;
import metodosAbstratos.exercicios.entities.Individual;
import metodosAbstratos.exercicios.entities.TaxPayer;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<TaxPayer>();

		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Tax Payer #" + i + " data: ");
			System.out.print("individual od Company (i/c)? ");
			char type = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			if (type == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual Income: ");
				Double anualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual Income: ");
				Double anualIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");

		for (TaxPayer taxPayer : list) {
			System.out.println(taxPayer.getName() + ": $" + String.format("%.2f", taxPayer.tax()));
		}

		double sumTax = 0.0;
		for (TaxPayer taxPayer : list) {
			sumTax += taxPayer.tax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sumTax);

		sc.close();

	}

}
