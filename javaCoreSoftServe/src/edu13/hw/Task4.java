package edu13.hw;
/*Create variable LocalDate birthday and set to that variable date your birthday.
Create method that takes as a parameter object LocalDate and print the day of the week and what was the day of the week after 6 months and what was the day of the week after 12 months.
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Function;

public class Task4 {
    public static LocalDate birthday = LocalDate.of(2004, 3, 31);
    public static Function<LocalDate, String> dayOfWeek = date -> date.getDayOfWeek().toString();

    public static void printDayOfWeek(LocalDate date) {
        String dayOfWeekCurrent = dayOfWeek.apply(date);
        String dayOfWeekAfter6Months = dayOfWeek.apply(date.plusMonths(6));
        String dayOfWeekAfter12Months = dayOfWeek.apply(date.plusMonths(12));

        System.out.println("the day of the week: " + dayOfWeekCurrent);
        System.out.println("the day of the week after 6 month: " + dayOfWeekAfter6Months);
        System.out.println("week day after 12 month: " + dayOfWeekAfter12Months);
    }

    public static void main(String[] args) {
        printDayOfWeek(birthday);
    }
}
