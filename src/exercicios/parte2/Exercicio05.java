package exercicios.parte2;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod, quant;
		double calc;
		
		double i1 = 4.00;
		double i2 = 4.50;
		double i3 = 5.00; 
		double i4 = 2.00;
		double i5 = 1.50;
		
		System.out.print("Informe o código: ");
		cod = sc.nextInt();
		System.out.print("Quantidade: ");
		quant = sc.nextInt();
		
		if(cod == 1) {
			calc = (i1 * quant);
			System.out.printf("Total: R$ %.2f", calc);
		} else if(cod == 2) {
			calc = (i2 * quant);
			System.out.printf("Total: R$ %.2f", calc);
		} else if(cod == 3) {
			calc = (i3 * quant);
			System.out.printf("Total: R$ %.2f", calc);
		} else if(cod == 4) {
			calc = (i4 * quant);
			System.out.printf("Total: R$ %.2f", calc);
		} else {
			calc = (i5 * quant);
			System.out.printf("Total: R$ %.2f", calc);
		} 
		
		sc.close();
	}
}
