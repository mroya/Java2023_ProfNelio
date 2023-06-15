package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 * - Imprimir todos os elementos do vetor
 * - Mostrar na tela a soma e a média dos elementos do vetor
 */
public class Exercicio_Soma_Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma, media;

		System.out.print("Quantos nº você vai digitar? ");
		n = sc.nextInt();

		double[] num = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um nº: ");
			num[i] = sc.nextDouble();
		}

		soma = 0;

		for (int i = 0; i < n; i++) {
			soma = soma + num[i];
		}

		media = soma / n;

		System.out.print("Valores = ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", num[i]);
		}

		System.out.printf("\nSOMA = %.2f", soma);
		System.out.printf("\nMÉDIA = %.2f", media);

		sc.close();

	}

}
