package exercicios.parte3;

import java.util.Locale;
import java.util.Scanner;

public class AlunoTest {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		System.out.println("Informe nome do ALuno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Informe as três notas: ");
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n ", aluno.media());

		if (aluno.media() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
		} else {
			System.out.println("PASS");
		}

		sc.close();

	}

}
