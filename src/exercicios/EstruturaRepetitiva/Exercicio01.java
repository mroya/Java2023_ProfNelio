package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/ 

public class Exercicio01 {

	public static void main(String[] args) {
		
		int senha;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a senha: ");
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Inválida");
			System.out.print("Informe a senha: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}
