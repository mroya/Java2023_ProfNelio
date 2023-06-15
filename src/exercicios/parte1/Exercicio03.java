package exercicios.parte1;

import java.util.Scanner;

// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.println("São 4 valores....");
		System.out.print("Informe o valor A: ");
		a = input.nextInt();
		System.out.print("Informe o valor B: ");
		b = input.nextInt();
		System.out.print("Informe o valor C: ");
		c = input.nextInt();
		System.out.print("Informe o valor D: ");
		d = input.nextInt();
		
		int calculo = ((a*b)-(c*d));
		
		System.out.printf("O resultado do cálculo (A * B - C * D) é = "+ calculo);
		
		input.close();

	}

}
