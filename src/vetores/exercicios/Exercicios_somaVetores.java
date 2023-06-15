package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
 * terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
 * o vetor C gerado.
 */

public class Exercicios_somaVetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();

		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < n; i++) {
			vetorA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor b: ");
		for (int j = 0; j < n; j++) {
			vetorB[j] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}

		System.out.println("Vetor Resultante: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d%n", vetorC[i]);
		}

		sc.close();

	}

}
