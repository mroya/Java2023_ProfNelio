package orientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

import orientacaoObjetos.entities.CurrencyConverter;

public class CurrencyConverterTest {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double priceDollar = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double qtDollar = sc.nextDouble();

		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.cotacao(priceDollar, qtDollar));

		sc.close();

	}

}
