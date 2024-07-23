package edu04.practical;

import java.util.Scanner;

public class WeekEnUa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of week day: ");
        String result = switch (sc.nextInt()) {
            case 1 -> "monday\nпонеділок";
            case 2 -> "tuesday\nвівторок";
            case 3 -> "thursday\nсереда";
            case 4 -> "wednesday\nчетвер";
            case 5 -> "friday\nп'ятниця";
            case 6 -> "saturday\nсубота";
            case 7 -> "sunday\nнеділя";
            default -> "error";
        };
        System.out.println(result);
        sc.close();
    }
}
