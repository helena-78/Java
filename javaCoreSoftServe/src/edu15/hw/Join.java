package edu15.hw;
//Run three threads and output there different messages for 5 times.
// The third thread supposed to start after finishing working of the two previous threads.
class MyThread1 extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Message " + i + ", thread " + name);
        }
    }
}

public class Join {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        MyThread1 t3 = new MyThread1();

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();

    }
}
