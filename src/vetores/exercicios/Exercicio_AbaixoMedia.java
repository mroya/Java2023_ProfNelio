package vetores.exercicios;

/*
 * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
 * mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
 * os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_AbaixoMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] num = new double[n];
		double soma = 0;
		double mediaVetor = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextDouble();
			soma += num[i];
			mediaVetor = soma / n;
		}
		System.out.println();
		System.out.println("Media do vetor= " + mediaVetor);

		System.out.println("Elementos abaixo da média: ");
		for (int i = 0; i < n; i++) {
			if (num[i] < mediaVetor) {
				System.out.println(" " + num[i]);
			}
		}

		sc.close();

	}

}
