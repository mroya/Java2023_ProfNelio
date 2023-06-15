package exercicios.parte1;

import java.util.Scanner;

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
//mensagem explicativa, conforme exemplos.

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Informe o 1º valor: ");
		a = input.nextInt();
		
		System.out.print("Informe o 2º valor: ");
		b = input.nextInt();
		
		int soma = a + b;
		
		System.out.println("A soma de " + a + " + " + b + " = " + soma);
		
		input.close();
		

	}

}
