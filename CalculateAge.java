package Assignment10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.function.Predicate;
import java.util.stream.Stream;



public class CalculateAge {

	public static void main(String[] args) {

		
		System.out.println("_____Calculate your age in no of days, months, years_______");
		LocalDate d = LocalDate.of(2000, 02, 12);
		LocalDate today = LocalDate.now();
		Period p = Period.between(d, today);
		System.out.println("Age : "+p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days");
		
		
		System.out.println("_____Compute programmers day without using plusDays_____");
		
		System.out.println(today.getDayOfWeek());
		
//		Stream<LocalDate> wholeyear= LocalDate.of(2025, 1, 1).datesUntil(LocalDate.of(2026, 1, 1));
//		Predicate<LocalDate> sundays = (s) ->  s.getDayOfWeek().equals(DayOfWeek.SUNDAY);;
//		Predicate<LocalDate> mnth = (s) -> s.getDayOfWeek()== sundays;
//		wholeyear.filter(sundays).filter(mnth).forEach(System.out::println);

	}

}
