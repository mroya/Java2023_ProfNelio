package exercicios.parte1;

import java.util.Scanner;

// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numFunc, horasTrab;
		double vlrHora;
		
		System.out.print("Qual o número do Funcionário? ");
		numFunc = input.nextInt();
		System.out.print("Qual as horas trabalhadas? ");
		horasTrab = input.nextInt();
		System.out.print("Qual o valor das horas trabalhadas? ");
		vlrHora = input.nextDouble();
		
		double calculoSalario = vlrHora * horasTrab;
		
		System.out.println("Número do Funcionáro: " + numFunc);
		System.out.printf("Salário do Funcionáro: R$ %.2f", calculoSalario);
		
		input.close();
				

	}

}
