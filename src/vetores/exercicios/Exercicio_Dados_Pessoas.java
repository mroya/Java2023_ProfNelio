package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
 * que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
 * de homens.
 */

public class Exercicio_Dados_Pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		double maior = 0;
		double menor = 0;

		Pessoa[] pessoa = new Pessoa[n];

		for (int i = 0; i < pessoa.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			char sexo = sc.next().charAt(0);
			pessoa[i] = new Pessoa(altura, sexo);
		}

		menor = pessoa[0].getAltura();

		for (int i = 1; i < n; i++) {
			if (pessoa[i].getAltura() < menor) {
				menor = pessoa[i].getAltura();
			}
		}

		System.out.printf("Menor Altura = %.2f\n", menor);

		maior = pessoa[0].getAltura();

		for (int i = 1; i < n; i++) {
			if (pessoa[i].getAltura() > maior) {
				maior = pessoa[i].getAltura();
			}
		}

		System.out.printf("Maior Altura = %.2f\n", maior);

		double soma = 0;
		int cont = 0;
		for (int i = 0; i < n; i++) {
			if (pessoa[i].getSexo() == 'F') {
				soma += pessoa[i].getAltura();
				cont++;
			}
		}
		System.out.printf("Media das alturas das mulheres = %.2f\n", (soma / cont));
		int contM = 0;
		for (int i = 0; i < n; i++) {
			if (pessoa[i].getSexo() == 'M') {
				contM++;
			}
		}
		System.out.println("Número de Homens = " + contM);

		sc.close();
	}

}
