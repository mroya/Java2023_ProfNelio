package interfaces.defaultMethods.application;

import java.util.Locale;
import java.util.Scanner;

import interfaces.defaultMethods.services.BrazilInterestService;
import interfaces.defaultMethods.services.InterestService;
import interfaces.defaultMethods.services.UsaInterestService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();

		System.out.println();

		InterestService is = new BrazilInterestService(2.0);
		double paymentBR = is.payment(amount, months);

		InterestService us = new UsaInterestService(1.0);
		double paymentUS = us.payment(amount, months);

		System.out.println("Tax Brazil");
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", paymentBR));
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("Tax USA");
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", paymentUS));

		sc.close();

	}

}
