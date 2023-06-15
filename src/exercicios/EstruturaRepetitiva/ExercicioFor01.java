package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
X, se for o caso*/

public class ExercicioFor01 {

	public static void main(String[] args) {

		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro qualquer de 0 até 1000:");
		x = sc.nextInt();

		for (int i = 0; i <= x; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
