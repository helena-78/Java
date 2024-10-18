package edu11.hw;

public class Task2 {
    public static void main(String[] args) {
        String sentence = "I  am  learning  java.";
        System.out.println(sentence);
        sentence = sentence.replaceAll("\\s+", " ");
        System.out.println(sentence);
    }
}
