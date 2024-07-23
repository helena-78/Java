package edu05.homeworks.task1;

import java.util.Scanner;

public class TenIntegerNumbers {
    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("input 10 integer numbers:");
        int[] numbers = new int[10];
        int sum = 0;
        int product = 1;
        boolean positive = true;
        for (int i = 0; i < 10; i++) {
            numbers[i] = getNumber();
            if ((i < 5) && (numbers[i] <= 0)) {
                positive = false;
            }
        }
        if (positive) {
            for (int i = 0; i < 5; i++) {
                sum += numbers[i];
            }
            System.out.println("sum of the first 5 numbers is " + sum);
        } else {
            for (int i = 4; i < 10; i++) {
                product *= numbers[i];
            }
            System.out.println("product of the last 5 numbers is " + product);
        }
    }
}