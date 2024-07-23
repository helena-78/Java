package edu05.practical;

import java.util.Scanner;

public class PrimeNumber {
    public static double getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextDouble();
    }

    public static void isPrime(double num) {
        if (num < 0) {
            System.out.println("number is not positive");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i != 0) {
                    System.out.println("Is a prime number");
                } else {
                    System.out.println("Is not a prime number");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        double num = getNumber("enter a positive number");
        isPrime(num);

    }
}
