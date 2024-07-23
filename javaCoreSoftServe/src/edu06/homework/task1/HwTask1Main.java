package edu06.homework.task1;

public class HwTask1Main {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle(true, true),
                new Swallow(true, true),
                new Penguin(true, true),
                new Kiwi(true, true)};
        for (Bird bird : birds) {
            bird.fly();
            System.out.println(bird.toString());
        }
    }
}
