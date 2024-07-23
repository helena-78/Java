package edu05.homeworks.task1;

import edu05.homeworks.task1.TenIntegerNumbers;

public class FiveNumbers {
    public static void main(String[] args) {
        System.out.println("input 5 int numbers: ");
        int[] numbers = new int[5];
        int positive = 0;
        int min = Integer.MAX_VALUE;
        int minPosition = 0;
        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = edu05.homeworks.task1.TenIntegerNumbers.getNumber();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positive++;
                if (positive == 2) {
                    System.out.println("position of second positive number is " + i);
                }
            }
            if (min > numbers[i]) {
                min = numbers[i];
                minPosition = i;
            }
            if ((numbers[i] % 2 == 0) && (numbers[i] != 0)) {
                product *= numbers[i];
            }
        }
        System.out.println("minimum value and its position in the array: " + min + ", position: " + minPosition);
        System.out.println("calculate the product of all entered even numbers (exclude 0 from even if entered by user): " + product);
    }
}
