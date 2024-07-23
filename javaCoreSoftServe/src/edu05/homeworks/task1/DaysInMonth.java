package edu05.homeworks.task1;

import java.util.Scanner;

public class DaysInMonth {
    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int[] daysMonths = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = daysMonths[getNumber("enter the month number: ") - 1];
        System.out.println("the number of days in that month: " + days);
    }
}
