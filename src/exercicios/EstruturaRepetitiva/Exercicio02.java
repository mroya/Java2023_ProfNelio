package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

public class Exercicio02 {

	public static void main(String[] args) {
		
		int x, y;
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe quadrante X: ");
		x=sc.nextInt();
		System.out.print("Informe quadrante Y: ");
		y=sc.nextInt();
		
		while(x!=0 && y!=0) {
			if(x>0 && y>0) {
				System.out.println("primeiro");
				System.out.print("Informe quadrante X: ");
				x=sc.nextInt();
				System.out.print("Informe quadrante Y: ");
				y=sc.nextInt();
			} 
			else if(x<0 && y>0) {
				System.out.println("segundo");
				System.out.print("Informe quadrante X: ");
				x=sc.nextInt();
				System.out.print("Informe quadrante Y: ");
				y=sc.nextInt();
			}
			else if(x<0 && y<0) {
				System.out.println("terceiro");
				System.out.print("Informe quadrante X: ");
				x=sc.nextInt();
				System.out.print("Informe quadrante Y: ");
				y=sc.nextInt();
			}
			else if(x>0 && y<0) {
				System.out.println("quarto");
				System.out.print("Informe quadrante X: ");
				x=sc.nextInt();
				System.out.print("Informe quadrante Y: ");
				y=sc.nextInt();
			}
		}
		
		sc.close();

	}

}
