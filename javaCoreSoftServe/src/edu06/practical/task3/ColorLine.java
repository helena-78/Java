package edu06.practical.task3;

public class ColorLine extends Line {
    private String color;

    public ColorLine(String color, Point point1, Point point2) {
        super(point1, point2);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }
}
