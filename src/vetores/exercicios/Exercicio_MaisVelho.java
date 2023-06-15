package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
 * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
 * da pessoa mais velha.
 */

public class Exercicio_MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da Pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}

		int maior = 0;
		String nomeMaior = null;
		for (int i = 0; i < n; i++) {
			if (idade[i] == 0) {
				maior = idade[i];
			} else if (idade[i] > maior) {
				maior = idade[i];
				nomeMaior = nome[i];
			}
		}

		System.out.println("Pessoa mais velha: " + nomeMaior);

		sc.close();

	}

}
