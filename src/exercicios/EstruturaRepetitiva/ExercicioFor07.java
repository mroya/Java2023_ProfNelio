package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
 * começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
 * exemplo.
 */

public class ExercicioFor07 {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um nº inteiro positivo: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int p = (int) Math.pow(i, 2);
			int q = (int) Math.pow(i, 3);
			System.out.printf("%d %d %d%n", i, p, q);
		}

		sc.close();

	}

}
