package edu06.homework.task1;

public class FlyingBird extends Bird {

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("the bird does  fly");
    }
}
