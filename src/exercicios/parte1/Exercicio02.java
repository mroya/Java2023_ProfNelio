package exercicios.parte1;

import java.util.Scanner;

// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
// casas decimais conforme exemplos. (A área de um círculo é pi vezes o raio elevado ao quadrado (A = π r²))

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double raio, area;
		
		System.out.print("Informe o valor do raio de um círculo: ");
		raio = input.nextDouble();
		area = (Math.PI * Math.pow(raio, 2));
		
		System.out.printf("A área do círculo com raio de " + raio + " é %.4f", area);
		
		
		input.close();
		
		
		
		
	}

}
