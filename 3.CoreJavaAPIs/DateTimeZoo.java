import java.time.*;

public class DateTimeZoo {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimalEnrichment(start, end);
    }

    public static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1);
        }
    }
}
