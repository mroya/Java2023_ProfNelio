package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

/*
 * Ler um número inteiro N e calcular todos os seus divisores.
 *  
 */

public class ExercicioFor06 {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.print("Calcular todos os divisores de: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
