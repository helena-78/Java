package edu05.homeworks;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Guess {
    static Scanner sc = new Scanner(System.in);

    public static void guess(int num) {
        boolean guessed = false;
        do {
            System.out.println("guess what the number is: ");
            int userNum = sc.nextInt();
            if (userNum > num) {
                System.out.println("Too high, try again");
            } else if (userNum < num) {
                System.out.println("Too low, try again");
            } else {
                guessed = true;
                System.out.println("you guessed!");
            }
        } while (!guessed);
    }

    public static void main(String[] args) {
        int num = ThreadLocalRandom.current().nextInt(-5, 5);

        guess(num);
    }
}
