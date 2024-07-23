package edu06.practical.task3;

public class ThirdTaskMain {
    public static void main(String[] args) {
        Line[] lines= {new Line(new Point(5,0),new Point(0,-3)),
                new ColorLine("white",new Point(-3,2),new Point(5,2))};
        for (Line line : lines) {
            line.print();
        }
    }
}
