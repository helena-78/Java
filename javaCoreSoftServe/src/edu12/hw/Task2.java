package edu12.hw;

import java.util.Scanner;

public class Task2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readNumber(int start, int end) throws IllegalArgumentException {
        System.out.print("Enter a number between " + start + " and " + end + ": ");
        if (!scanner.hasNextInt()) {
            throw new IllegalArgumentException("Input is not a valid integer.");
        }
        int number = scanner.nextInt();
        if (number < start || number > end) {
            throw new IllegalArgumentException("Input is out of the valid range [" + start + "..." + end + "].");
        }
        return number;
    }

    public static void main(String[] args) {
        try {
            int start = 10;
            int end = 20;
            int number = readNumber(start, end);
            System.out.println("You entered a valid number: " + number);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        scanner.close();
    }
}
