package edu09.practical;

import java.util.ArrayList;
import java.util.List;

public class HeavyBox<T, V> {
    private T content;
    private V weight;

    public HeavyBox(T content, V weight) {
        this.content = content;
        this.weight = weight;
    }

    public T getContent() {
        return content;
    }

    public V getWeight() {
        return weight;
    }

    public void setWeight(V weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "content=" + content +
                ", weight=" + weight +
                '}';
    }
}
