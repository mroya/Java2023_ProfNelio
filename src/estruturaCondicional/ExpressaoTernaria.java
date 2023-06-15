package estruturaCondicional;

import java.util.Scanner;

public class ExpressaoTernaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Exemplo1
		//double preco = 34.5;
		//double desconto;
		//if(preco < 20.00) {
			//desconto = preco * 0.1;
		//} else {
			//desconto = preco * 0.05;
		//}
		
		// Exemplo com a expressão ternária
		double preco = 34.50;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		sc.close();
	}

}
