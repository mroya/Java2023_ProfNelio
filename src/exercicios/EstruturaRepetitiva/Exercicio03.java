package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
exemplo.*/

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Tipo de combustível => ");
		System.out.printf("1.Álcool 2.Gasolina 3.Diesel 4.Fim%n");
		int tipo = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (tipo != 4) {
			if (tipo == 1) {
				alcool += 1;
			} else if (tipo == 2) {
				gasolina += 1;
			} else if (tipo == 3) {
				diesel += 1;
			}

			System.out.printf("Tipo de combustível => ");
			System.out.printf("1.Álcool 2.Gasolina 3.Diesel 4.Fim%n");
			tipo = sc.nextInt();
		}
		System.out.println("-------------------------");
		System.out.println("Muito Obrigado!");
		System.out.println("Ranking dos combustíveis:");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();

	}

}
