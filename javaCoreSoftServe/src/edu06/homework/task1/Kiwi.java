package edu06.homework.task1;

public class Kiwi extends NonFlyingBird {
    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Kiwi{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
