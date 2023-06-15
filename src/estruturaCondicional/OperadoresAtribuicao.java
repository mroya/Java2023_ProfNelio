package estruturaCondicional;

import java.util.Scanner;

// Uma operadora de telefonia cobra R$ 50,00 por um plano básico que
// dá direito a 100 minutos de telefone. Cada minuto que exceder a franquia de
// 100 minutos custa R$ 2.00. Fazer um programa que para ler a quantidade de 
// minutos que uma pessoa consumiu, então mostrar o valor a ser pago.

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double vlrPagar = 50;
		
		System.out.print("Qual o total utilizado em minutos: ");
		double minutos = sc.nextDouble();
		
		if(minutos > 100) {
			vlrPagar += (minutos -100) * 2.0;			
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", vlrPagar);
		
		sc.close();

	}

}
