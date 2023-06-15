package data_hora;

import java.time.LocalDate;

public class CalculoDataHora {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		// LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		// Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(28);

		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

	}

}
