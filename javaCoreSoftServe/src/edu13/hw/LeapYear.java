package edu13.hw;
import java.time.LocalDate;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        LocalDate date = LocalDate.of(year, 1, 1);
        return date.isLeapYear();
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(2023));
        System.out.println(isLeapYear(2020));
    }
}
