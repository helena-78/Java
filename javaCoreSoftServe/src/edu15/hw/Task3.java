package edu15.hw;

//Create a thread «one», which would start the thread «two», which has to output its number («Thread number two») 3 times
// and create thread «three», which would to output message «Thread number three» 5 times.
public class Task3 extends Thread {
    static Thread t2 = new Thread(() -> {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number two");
        }
    });
    static Thread t1 = new Thread(() -> {
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });
    static Thread t3 = new Thread(() -> {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread number three");
        }
    });

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        t3.start();
        t1.join();
        t3.join();
    }
}
