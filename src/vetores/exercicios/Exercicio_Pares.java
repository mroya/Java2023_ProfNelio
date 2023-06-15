package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
 * tela todos os números pares, e também a quantidade de números pares. 
 */

public class Exercicio_Pares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		int[] numeros = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();
		}

		System.out.println();

		int cont = 0;

		System.out.println("NUMEROS PARES: ");

		for (int i = 0; i < n; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(" " + numeros[i]);
			}
		}
		System.out.println();
		System.out.println();

		for (int i = 0; i < n; i++) {
			if (numeros[i] % 2 == 0) {
				cont++;
			}
		}
		System.out.print("QUANTIDADE DE PARES = " + cont);
		sc.close();

	}

}
