package edu05.practical;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProcessing {
    public static void ascendingStringArraySorting(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void averageValueCalculation(double[] array) {
        double totalSum = 0;
        double average = 0;
        for (double v : array) {
            totalSum += v;
        }
        average = totalSum / array.length;
        System.out.println(average);
    }

    public static void findValue(String[] array, String value) {
        boolean hasValue = false;
        for (String s : array) {
            if (s.contains(value)) {
                hasValue = true;
                break;
            }
        }
        if (hasValue) {
            System.out.println("the array has a specified value");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] week = new String[]{"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        double[] average = new double[]{2.4, 1.2, -8.5, 9.5, 2};
        ascendingStringArraySorting(week);
        averageValueCalculation(average);

        System.out.println("input the value you wish to find in a String array: ");
        String str = sc.nextLine();
        findValue(week, "day");
    }
}
