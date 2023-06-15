package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now(); // horario local do computador
		Instant d03 = Instant.now(); // fuso global gera horário de Londres

		LocalDate d04 = LocalDate.parse("2022-05-29");
		LocalDateTime d05 = LocalDateTime.parse("2022-05-29T11:38:26");
		Instant d06 = Instant.parse("2022-05-29T11:38:26Z");
		Instant d07 = Instant.parse("2022-05-29T11:38:26-03:00");
		LocalDate d08 = LocalDate.parse("29/05/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("29/05/2023 01:30", fmt2);
		LocalDate d10 = LocalDate.of(2023, 5, 29);

		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);

	}

}
