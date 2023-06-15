package estruturasRepetitivas;

import java.util.Scanner;

// Crie um algoritmo de repetição utilizando o laço FOR, pedindo
// a quantidade de números digitados e mostrar a soma deles no final.

public class EstruturaRepetitivaFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("qt de números: ");
		int x=sc.nextInt();
		
		int soma=0;
		for(int i=0;i<x;i++) {
			x=sc.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		sc.close();

	}

}
