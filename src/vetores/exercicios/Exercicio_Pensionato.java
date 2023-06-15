package vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Hotel[] hotel = new Hotel[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + (i) + ":");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();

			hotel[room] = new Hotel(name, email);
		}
		System.out.println();
		System.out.println("Busy Rooms:");
		for (int i = 0; i < 10; i++) {
			if (hotel[i] != null) {
				System.out.println(i + ":" + hotel[i]);
			}
		}

		sc.close();

	}

}
