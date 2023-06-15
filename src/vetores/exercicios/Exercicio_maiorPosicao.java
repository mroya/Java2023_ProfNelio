package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
 * o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento
 * considerando a primeira posição como 0 (zero).
 */

public class Exercicio_maiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		double[] numeroMaior = new double[n];
		double maior = 0;
		int indiceMaior = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			numeroMaior[i] = sc.nextFloat();
			if (numeroMaior[i] == 0) {
				maior = numeroMaior[i];
			} else if (numeroMaior[i] > maior) {
				maior = numeroMaior[i];
				indiceMaior = i;
			}
		}
		System.out.println();
		System.out.println("MAIOR VALOR = " + maior);

		System.out.println("POSIÇÃO DO MAIOR VALOR = " + indiceMaior);

		sc.close();

	}

}
