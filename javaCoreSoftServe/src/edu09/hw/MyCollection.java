package edu09.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MyCollection {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int imin = 0;
        int imax = 0;
        int k = 0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(201) - 100);
        }
        System.out.println("original myCollection: " + myCollection);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
                imin = i;
            }
            if (myCollection.get(i) > max) {
                max = myCollection.get(i);
                imax = i;
            }
        }
        myCollection.set(imin, max);
        myCollection.set(imax, min);
        System.out.println("swapping min&max, myCollection: " + myCollection);

        if (myCollection.get(0) < 0) {
            myCollection.add(0, (100 + random.nextInt(900)));
        } else {
            for (int i = 1; i < myCollection.size(); i++) {
                if (myCollection.get(i) < 0) {
                    myCollection.add(i, (100 + random.nextInt(900)));
                    break;
                }
            }
        }
        System.out.println("Insert a random three-digit number before the first negative element: " + myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) > 0 && myCollection.get(i + 1) < 0) || (myCollection.get(i) < 0 && myCollection.get(i + 1) > 0)) {
                myCollection.add(i + 1, 0);
            }
        }
        System.out.println("Insert a zero between all neighboring elements collection myCollection with different signs: " + myCollection);

        System.out.println("input k elements to be copied to the list1: ");
        k = sc.nextInt();
        if (k < myCollection.size()) {
            for (int i = 0; i < k; i++) {
                list1.add(myCollection.get(i));
            }
            for (int i = myCollection.size() - 1; i >= k; i--) {
                list2.add(myCollection.get(i));
            }
            System.out.println("list1: " + list1);
            System.out.println("list2: " + list2);
        } else {
            System.out.println("there as not enough elements, the size of myCollection is: " + myCollection.size());
        }

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                break;
            } else {
                System.out.println("there is no such element in the list");
            }
        }
        System.out.println("In a list myCollection remove the last even element: " + myCollection);

        min = 0;
        imin = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
                imin = i;
            }
        }
        if (imin < myCollection.size() - 1) {
            myCollection.remove(imin + 1);
        }
        System.out.println("Remove from the list myCollection the element following the first minimum: " + myCollection);
        sc.close();
    }
}
