package exercicios.parte1;

import java.util.Scanner;

// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		int codPeca1, qtPeca1, totPeca1;
		@SuppressWarnings("unused")
		int codPeca2, qtPeca2, totPeca2;
		double vlrUnit1, vlrUnit2;
		
		System.out.print("Qual o código da Roupa1 : ");
		codPeca1 = input.nextInt();
		System.out.print("Quantas pecas vc esta comprando deste código 1: ");
		qtPeca1 = input.nextInt();
		System.out.print("Qual o valor unitário desta peca 1: ");
		vlrUnit1 = input.nextDouble();
		
		double totalPeca1 = (qtPeca1*vlrUnit1);
		
		System.out.print("Qual o código da Roupa2 : ");
		codPeca2 = input.nextInt();
		System.out.print("Quantas pecas vc esta comprando deste código 2: ");
		qtPeca2 = input.nextInt();
		System.out.print("Qual o valor unitário desta peca 2: ");
		vlrUnit2 = input.nextDouble();
		
		double totalPeca2 = (qtPeca2*vlrUnit2);
		
		double vlrPagar = totalPeca1+totalPeca2;
		
		System.out.printf("Valor a pagar: R$%.2f", vlrPagar);
				
		input.close();
		
		
	}

}
