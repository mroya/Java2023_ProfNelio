package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
 * aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
 * digitado, mostrar a mensagem "NENHUM NUMERO PAR" 
 */

public class Exercicio_MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] numPar = new int[n];
		int soma = 0;
		int media = 0;
		int cont = 0;
		int contImpar = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			numPar[i] = sc.nextInt();
			if (numPar[i] % 2 == 0) {
				cont++;
				soma = soma + numPar[i];
				media = soma / cont;
			} else if (numPar[i] % 2 == 1) {
				contImpar++;
			}
		}

		if (cont > 0) {
			System.out.printf("MEDIA DOS PARES = %.1f", (double) media);
		} else if (contImpar > 0) {
			System.out.println("NENHUM NÚMERO PAR");
		}

		sc.close();
	}
}
