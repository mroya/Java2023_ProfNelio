package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
 * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)
 */

public class ExercicioFor02 {

	public static void main(String[] args) {

		int n;
		int in = 0;
		int out = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números queres digitar: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um valor: ");
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println("-------------------------");
		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}

}
