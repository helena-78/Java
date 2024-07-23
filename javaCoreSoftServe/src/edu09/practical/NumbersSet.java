package edu09.practical;

import java.util.Random;
import java.util.*;

public class NumbersSet {
    static Scanner sc = new Scanner(System.in);

    public static String getNumber(String prompt) {
        System.out.println(prompt);
        return sc.nextLine();
    }

    private static void ensureCapacity(List<Integer> list, int minCapacity) { //is it ok????????
        while (list.size() <= minCapacity) {
            list.add(0);
        }
    }

    public static void main(String[] args) {
        System.out.println("==============TASK 2=============");
        String[] stringNum = getNumber("input numbers in a format of 1,24,5,4 : ").split(",");
        Set<Integer> numSet = new TreeSet<>();
        for (String string : stringNum) {
            numSet.add(Integer.parseInt(string.trim()));
        }
        System.out.println(numSet);

        System.out.println("==============TASK 3=============");
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(30));
        }
        System.out.println("original myCollection: " + myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("newCollection: " + newCollection);

        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 20) {
                iterator.remove();
            }
        }
        System.out.println("myCollection after remove(): " + myCollection);

        ensureCapacity(myCollection, 8);
        myCollection.set(2, 1);
        myCollection.set(8, -3);
        myCollection.set(5, -4);
        System.out.println("inserting elements: " + myCollection);
        System.out.println("position – 2, value of element – " + myCollection.get(2));
        System.out.println("position – 8, value of element – " + myCollection.get(8));
        System.out.println("position – 5, value of element – " + myCollection.get(5));

        sc.close();
    }
}
