package interfaces.exercicio.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.exercicio.entities.Contract;
import interfaces.exercicio.entities.Installment;
import interfaces.exercicio.services.ContractService;
import interfaces.exercicio.services.PaypalService;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate dataContrato = LocalDate.parse(sc.next(), fmt);
		System.out.println("Valor do contrato: ");
		double totalValue = sc.nextDouble();

		Contract obj = new Contract(number, dataContrato, totalValue);

		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();

		ContractService contractService = new ContractService(new PaypalService());

		contractService.processContract(obj, n);

		System.out.println("Parcelas:");

		for (Installment installment : obj.getInstallments()) {
			System.out.println(installment);
		}

		sc.close();
	}

}
