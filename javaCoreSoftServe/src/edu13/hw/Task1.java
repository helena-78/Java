package edu13.hw;

import java.util.function.Function;

public class Task1 {
    public static String encrypt(String s, int n) {
        StringBuilder strBuilder = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            int code = strBuilder.charAt(i);
            strBuilder.setCharAt(i, (char) (code + n));
        }
        return strBuilder.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, -n);
    }

    public static void main(String[] args) {
        Encryptor encryptor = s -> encrypt(s, 3);
        String encrypted = encryptor.operate("abc");
        System.out.println("Encrypted string :" + encrypted);

        Encryptor decryptor = s -> decrypt(s, 3);
        String decrypted = decryptor.operate(encrypted);
        System.out.println("Decrypted string :" + decrypted);
    }
}

@FunctionalInterface
interface Encryptor {
    String operate(String s);
}