package exercicios.parte2;

import java.util.Scanner;

// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
// ordem crescente ou decrescente

public class Exercicio03 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o 1º número inteiro: ");
		a=sc.nextInt();
		System.out.print("Informe o 2º número inteiro: ");
		b=sc.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("São Multiplos!");
		} else {
			System.out.println("Não são Multiplos!");
		}
		sc.close();

	}

}
