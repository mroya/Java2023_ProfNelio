package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

/*
 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
 * Lembrando que, por definição, fatorial de 0 é 1
 */

public class ExercicioFor05 {

	public static void main(String[] args) {

		int n;
		long fatorial = 1;
		Scanner sc = new Scanner(System.in);

		System.out.print("Fatorial de qual número: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);

		sc.close();

	}

}
