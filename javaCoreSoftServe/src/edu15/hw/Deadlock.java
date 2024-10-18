package edu15.hw;

//Cause a deadlock. Organize the expectations of ending a thread in main(),
// and make the end of the method main() in this thread.
public class Deadlock extends Thread {
    final static Object first = new Object();
    final static Object second = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (first) {
                System.out.println("Thread " + Thread.currentThread().getName() + " locked first object");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }
                synchronized (second) {
                    System.out.println("Thread " + Thread.currentThread().getName() + " locked second object");
                }
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " unlocked ALL objects");
        });

        Thread t2 = new Thread(() -> {
            synchronized (second) {
                System.out.println("Thread " + Thread.currentThread().getName() + " locked second object");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }
                synchronized (first) {
                    System.out.println("Thread " + Thread.currentThread().getName() + " locked first object");
                }
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " unlocked ALL objects");
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Main method ends.");
    }
}
