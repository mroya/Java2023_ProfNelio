package matriz;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas Linhas? ");
		int L = sc.nextInt();
		System.out.print("Quantas Colunas? ");
		int C = sc.nextInt();

		int[][] mat = new int[L][C];

		for (int i = 0; i < L; i++) {
			for (int j = 0; j < C; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.print("Digite um número pertencente a matriz: ");
		int numMatriz = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == numMatriz) {
					System.out.println("Position " + i + ", " + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}
}
