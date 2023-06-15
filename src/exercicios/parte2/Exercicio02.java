package exercicios.parte2;

import java.util.Scanner;

// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

public class Exercicio02 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número inteiro e descubra se ele é PAR ou ÍMPAR:");
		num = sc.nextInt();
		
		if(num %2 == 0) {
			System.out.println("Número PAR!");
		} else {
			System.out.println("Número ÍMPAR!");
		}
		
		sc.close();

	}

}
