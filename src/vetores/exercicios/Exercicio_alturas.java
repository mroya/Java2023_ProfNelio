package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
 * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
 * bem como os nomes dessas pessoas caso houver. 
 */
public class Exercicio_alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		double soma, media;

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + " Pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}

		soma = 0;
		int cont = 0;

		for (int i = 0; i < n; i++) {
			soma = soma + altura[i];
		}

		media = soma / n;

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				cont++;
			}
		}

		double result = (cont * 100.0) / n;

		System.out.println();
		System.out.printf("Altura media: %.2f\n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", result);
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		sc.close();

	}

}
