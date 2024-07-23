package edu06.homework.task1;

public class Eagle extends FlyingBird {
    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
