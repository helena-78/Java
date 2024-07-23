package edu04.homeworks;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        int num1 = getNumber("input first number: ");
        int num2 = getNumber("input second number: ");
        int num3 = getNumber("input third number: ");
        int[] array = {num1, num2, num3};
        System.out.println("minimum values among the three numbers "+getMax(array));
        System.out.println("maximum values among the three numbers "+getMin(array));
    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextInt();
    }

    public static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }

    public static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
}
