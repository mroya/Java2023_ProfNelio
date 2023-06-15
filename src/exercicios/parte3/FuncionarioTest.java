package exercicios.parte3;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioTest {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario func = new Funcionario();

		System.out.print("Name: ");
		func.name = sc.nextLine();
		System.out.print("Gross Salary : ");
		func.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();

		System.out.println("Employe: " + func);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();

		func.increaseSalary(percentage);

		System.out.println();
		System.out.println("Update data: " + func);
		sc.close();

	}

}
