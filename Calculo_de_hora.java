package Data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculo_de_hora {

	public static void main(String[] args) {

		LocalDate t01 = LocalDate.parse("2023-07-15");
		LocalDateTime t02 = LocalDateTime.parse("2023-07-15T01:15:22");
		Instant t03 = Instant.parse("2023-07-15T02:24:11Z");
				
		LocalDate pastWeekDate = t01.minusDays(7);
		LocalDate nextWeekDate = t01.plusDays(7);
		
		LocalDateTime pastWeekDateTime = t02.minusHours(1);
		LocalDateTime nextWeekDateTime = t02.plusHours(1);
		
		Instant pastWeekInstant = t03.minus(7,ChronoUnit.DAYS);
		Instant nextWeekInstant = t03.plus(7, ChronoUnit.DAYS);
		Instant pastMinutesInstant = t03.minus(10, ChronoUnit.MINUTES);

		System.out.println("t01 = " + t01);
		System.out.println("pastWeekDate = " + pastWeekDate);
		System.out.println("nextWeekDate = " + nextWeekDate);

		System.out.println();		
		
		System.out.println("t02 = " + t02);
		System.out.println("pastWeekDateTime = " + pastWeekDateTime);
		System.out.println("nextWeekDateTime = " + nextWeekDateTime);
		
		System.out.println();
		
		System.out.println("t03 = " + t03);
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
        System.out.println("pastMinutesInsant = " + pastMinutesInstant);
        
        Duration t04 = Duration.between(pastWeekDateTime, t02);
        Duration t05 = Duration.between(pastWeekDate.atTime(0,0), t01.atTime(0,0));
        t05 = Duration.between(pastWeekDate.atStartOfDay(), t01.atStartOfDay()); 
     // qualquer uma das duas formas de escrever converte um date em um date time, pois 
        System.out.println("Duration = " + t04.toHours());
        // para dar positivo, é sempre o menor e depois o maior 
        
        System.out.println("Duration = " + t05.toDays());

        
	}

}
