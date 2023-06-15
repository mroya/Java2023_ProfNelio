package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
 * no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
 * os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
 * igual a 6.0 (seis).
 */
public class Exercicio_Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();

		Aluno[] aluno = new Aluno[n];

		for (int i = 0; i < aluno.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %d aluno\n", i + 1);
			sc.nextLine();
			String nome = sc.nextLine();
			double notaA = sc.nextDouble();
			double notaB = sc.nextDouble();
			aluno[i] = new Aluno(nome, notaA, notaB);
		}

		System.out.println("Alunos Aprovados:");
		for (int j = 0; j < n; j++) {
			double soma = aluno[j].getNotaA() + aluno[j].getNotaB();
			double media = soma / 2;
			if (media >= 6.0) {
				System.out.println(aluno[j].getNome());
			}
		}

		sc.close();

	}

}
