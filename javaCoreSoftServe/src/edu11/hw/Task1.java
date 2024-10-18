package edu11.hw;

import java.util.Scanner;

public class Task1 {
    public static Scanner scanner = new Scanner(System.in);

    public static String fiveWordsSentence() {
        System.out.println("Sentence of five words: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        if (words.length != 5) {
            System.out.println("Sentence must consist of 5 words");
            return "";
        }
        return sentence;
    }

    public static String longestWord(String sentence) {
        String longestWord = "";
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static String reverseWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reverseWord = new StringBuilder(words[1]);
        reverseWord.reverse();
        return reverseWord.toString();
    }

    public static void main(String[] args) {
        String sentence = fiveWordsSentence();
        if (!sentence.isEmpty()) {
            String longestWord = longestWord(sentence);
            System.out.println("Sentence: " + sentence);
            System.out.println("The longest word: " + longestWord);
            System.out.println("Letters in the longest word: " + longestWord.length());
            System.out.println("The second word of the sentence in reverse order: " + reverseWord(sentence));
        }
    }
}
