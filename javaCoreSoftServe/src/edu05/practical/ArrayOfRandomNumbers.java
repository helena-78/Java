package edu05.practical;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayOfRandomNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int startInterval = -5;
        int endInterval = 5;
        int max = Integer.MIN_VALUE;
        int sumPositive = 0;
        int countNegative = 0;
        int countPositive = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(startInterval, endInterval);
            System.out.println(numbers[i]);
        }

        for (int v : numbers) {
            if (max < v) {
                max = v;
            }
            if (v > 0) {
                sumPositive += v;
            }
            if (v < 0) {
                countNegative++;
            }
        }
        countPositive = numbers.length - countNegative;

        System.out.println("the biggest number in the array: " + max +
                "\nthe sum of positive numbers: " + sumPositive +
                "\nthe number of negative numbers: " + countNegative);
        if (countNegative > countPositive) {
            System.out.println("There are more negative values in the array.");
        } else if (countNegative < countPositive) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }
}
