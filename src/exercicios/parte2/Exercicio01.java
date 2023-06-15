package exercicios.parte2;

import java.util.Scanner;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Informe um número inteiro: ");
		num=sc.nextInt();
		
		if(num < 0) {
			System.out.println("O número "+num+" é negativo!");
		} else {
			System.out.println("O número "+num+" é positivo!");
		}
		
		sc.close();
	}
	
}
