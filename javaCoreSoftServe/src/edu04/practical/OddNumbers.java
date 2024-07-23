package edu04.practical;
import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        int num1 = getNumber("input first number: ");
        int num2 = getNumber("input second number: ");
        int num3 = getNumber("input third number: ");
        int[] array = {num1, num2, num3};

        System.out.println("How many of numbers are odd: " + OddNumbersAmount(array));
    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextInt();
    }

    public static int OddNumbersAmount(int[] array) {
        int count = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
