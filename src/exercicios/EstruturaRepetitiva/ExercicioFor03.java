package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

/* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
 * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
 * peso 5.
 */

public class ExercicioFor03 {

	public static void main(String[] args) {
		int x;
		double mp = 0;
		double s1 = 0;
		double s2 = 0;
		double s3 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos conjunto de notas quer ler: ");
		x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			System.out.print(i + "ª nota: ");
			double a = sc.nextDouble();
			if (i == 1) {
				s1 = (a * 2);
			} else if (i == 2) {
				s2 = (a * 3);
			} else if (i == 3) {
				s3 = (a * 5);
			}
		}

		mp = (s1 + s2 + s3) / 10;

		System.out.printf("Média %.1f ", mp);

		sc.close();
	}

}
