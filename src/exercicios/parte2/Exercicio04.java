package exercicios.parte2;

import java.util.Scanner;

// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas

public class Exercicio04 {

	public static void main(String[] args) {
		
		int horaInicial, horaFinal, calc;
		int dia = 24;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Hora inicial do Jogo: ");
		horaInicial = sc.nextInt();
		System.out.print("Hora final do Jogo: ");
		horaFinal = sc.nextInt();
		
		if(horaInicial > 12) {
			calc = (dia - horaInicial) + horaFinal;
			System.out.println("O jogo durou " + calc + " horas.");
		} else if(horaInicial > 0 && horaInicial < 12){
			calc = (horaFinal - horaInicial);
			System.out.println("O jogo durou " + calc + " horas.");
		} else {
			System.out.println("O jogo durou 24 horas.");
		}
		sc.close();
	}
}
